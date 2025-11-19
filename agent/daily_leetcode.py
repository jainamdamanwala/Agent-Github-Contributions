import os
import openai
import datetime
import json
from pathlib import Path

openai.api_key = os.getenv("OPENAI_API_KEY")


def pick_question():
    """
    AI picks 1 random LeetCode question (Easy / Medium / Hard).
    Mixed difficulty over time.
    """
    prompt = """
    You are helping me practice LeetCode daily.

    Today, randomly choose ONE LeetCode problem:
    - Difficulty must be randomly selected among: Easy, Medium, Hard
    - Over many days, distribution should be roughly:
        * 50% Easy
        * 35% Medium
        * 15% Hard
    - Pick a real, well-known LeetCode problem.

    Return STRICTLY valid JSON ONLY, no backticks, no extra text, in this format:
    {
      "title": "Two Sum",
      "id": "1",
      "difficulty": "Easy",
      "url": "https://leetcode.com/problems/two-sum/",
      "prompt": "full official or near-official problem statement"
    }
    """

    response = openai.chat.completions.create(
        model="gpt-4.1",
        messages=[{"role": "user", "content": prompt}]
    )

    raw = response.choices[0].message.content.strip()
    return json.loads(raw)


def solve_question(q):
    """
    Generate Python + Java solutions and explanation for the selected problem.
    """
    prompt = f"""
    Solve the following LeetCode problem.

    Title: {q['title']}
    ID: {q['id']}
    Difficulty: {q['difficulty']}
    URL: {q['url']}

    Problem Statement:
    {q['prompt']}

    Requirements:
    - Provide a clean, production-quality solution in **Python**.
    - Provide a clean, production-quality solution in **Java**.
    - Both solutions must be complete and directly runnable on LeetCode.
      * For Python: define a class Solution with the required method.
      * For Java: define class Solution with the required method.
    - Add comments only where useful, not everywhere.
    - Then write a detailed explanation with:
        * Approach
        * Why it works
        * Time complexity
        * Space complexity

    Output STRICTLY valid JSON ONLY, no backticks, no extra text, in this format:
    {
      "python": "full python solution code here",
      "java": "full java solution code here",
      "explanation": "detailed explanation here"
    }
    """

    response = openai.chat.completions.create(
        model="gpt-4.1",
        messages=[{"role": "user", "content": prompt}]
    )

    raw = response.choices[0].message.content.strip()
    return json.loads(raw)


def write_files(question, solutions):
    """
    Write solutions and explanation under solutions/YYYY-MM-DD/
    """
    today = datetime.date.today().isoformat()
    folder = Path(f"solutions/{today}")
    folder.mkdir(parents=True, exist_ok=True)

    # Python solution
    with open(folder / "solution.py", "w", encoding="utf-8") as f:
        f.write("# " + question["title"] + "\n")
        f.write(f"# Difficulty: {question['difficulty']}\n")
        f.write(f"# URL: {question['url']}\n\n")
        f.write(solutions["python"])

    # Java solution
    with open(folder / "solution.java", "w", encoding="utf-8") as f:
        f.write("// " + question["title"] + "\n")
        f.write(f"// Difficulty: {question['difficulty']}\n")
        f.write(f"// URL: {question['url']}\n\n")
        f.write(solutions["java"])

    # Explanation
    with open(folder / "explanation.md", "w", encoding="utf-8") as f:
        f.write(f"# {question['title']}\n\n")
        f.write(f"**ID:** {question['id']}  \n")
        f.write(f"**Difficulty:** {question['difficulty']}  \n")
        f.write(f"**Link:** {question['url']}\n\n")
        f.write("## Explanation\n\n")
        f.write(solutions["explanation"])


def main():
    print("Picking today's LeetCode problem (mixed difficulty)...")
    question = pick_question()
    print(f"Selected: {question['title']} ({question['difficulty']})")

    print("Generating solutions...")
    solutions = solve_question(question)

    print("Writing files...")
    write_files(question, solutions)

    print("Daily LeetCode solution generated successfully.")


if __name__ == "__main__":
    main()