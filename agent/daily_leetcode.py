import os
import json
import datetime
from pathlib import Path
from groq import Groq

client = Groq(api_key=os.getenv("GROQ_API_KEY"))

def pick_question():
    prompt = """
    Pick ONE real LeetCode problem for today's practice.

    Difficulty distribution:
    - 50% Easy
    - 35% Medium
    - 15% Hard

    Output STRICT JSON ONLY, in this format:
    {
      "title": "",
      "id": "",
      "difficulty": "",
      "url": "",
      "prompt": "full problem statement"
    }
    """

    response = client.chat.completions.create(
        model="llama-3.1-70b-versatile",
        messages=[{"role": "user", "content": prompt}],
        temperature=0.7
    )

    raw = response.choices[0].message.content.strip()
    return json.loads(raw)


def solve_question(q):
    prompt = f"""
    Solve this LeetCode problem:

    Title: {q['title']}
    Difficulty: {q['difficulty']}
    URL: {q['url']}
    Problem Statement:
    {q['prompt']}

    Requirements:
    - Provide Python and Java LeetCode-ready solutions.
    - Include a detailed explanation.

    Output STRICT JSON ONLY:
    {{
      "python": "",
      "java": "",
      "explanation": ""
    }}
    """

    response = client.chat.completions.create(
        model="llama-3.1-70b-versatile",
        messages=[{"role": "user", "content": prompt}],
        temperature=0.4
    )

    raw = response.choices[0].message.content.strip()
    return json.loads(raw)


def write_files(question, solutions):
    today = datetime.date.today().isoformat()
    folder = Path(f"solutions/{today}")
    folder.mkdir(parents=True, exist_ok=True)

    with open(folder / "solution.py", "w", encoding="utf-8") as f:
        f.write("# " + question["title"] + "\n")
        f.write(f"# Difficulty: {question['difficulty']}\n")
        f.write(f"# URL: {question['url']}\n\n")
        f.write(solutions["python"])

    with open(folder / "solution.java", "w", encoding="utf-8") as f:
        f.write("// " + question["title"] + "\n")
        f.write(f"// Difficulty: {question['difficulty']}\n")
        f.write(f"// URL: {question['url']}\n\n")
        f.write(solutions["java"])

    with open(folder / "explanation.md", "w", encoding="utf-8") as f:
        f.write(f"# {question['title']}\n\n")
        f.write(f"**ID:** {question['id']}  \n")
        f.write(f"**Difficulty:** {question['difficulty']}  \n")
        f.write(f"**Link:** {question['url']}\n\n")
        f.write(solutions["explanation"])


def main():
    print("Selecting today's LeetCode problem...")
    q = pick_question()
    print(f"Picked: {q['title']} ({q['difficulty']})")

    print("Generating solutions...")
    solutions = solve_question(q)

    print("Writing output files...")
    write_files(q, solutions)

    print("Daily LeetCode solution generated successfully!")


if __name__ == "__main__":
    main()