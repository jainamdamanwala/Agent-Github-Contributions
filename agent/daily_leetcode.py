import os
import json
import datetime
import re
from pathlib import Path
from groq import Groq

# Initialize Groq client
client = Groq(api_key=os.getenv("GROQ_API_KEY"))

# ----------------------------------------
# JSON Extraction Helper
# ----------------------------------------
def extract_json(text):
    """
    Extract first valid JSON object from model output.
    Removes markdown fences and any extra text.
    """
    # Remove markdown ```json and ```
    cleaned = text.replace("```json", "").replace("```", "").strip()

    # Regex to find first JSON object
    match = re.search(r"\{.*\}", cleaned, flags=re.DOTALL)
    if not match:
        print("RAW MODEL OUTPUT (for debugging):")
        print(text)
        raise ValueError("❌ No JSON found in model output")

    json_str = match.group(0)

    try:
        return json.loads(json_str)
    except Exception:
        print("FAILED JSON PARSE. RAW:")
        print(json_str)
        raise


# ----------------------------------------
# STEP 1 — Pick LeetCode Question
# ----------------------------------------
def pick_question():
    prompt = """
    Pick ONE real LeetCode problem.

    Difficulty distribution:
    - 50% Easy
    - 35% Medium
    - 15% Hard

    STRICT INSTRUCTIONS:
    - Output JSON only.
    - No markdown.
    - No commentary.

    JSON FORMAT:
    {
      "title": "string",
      "id": "string or number",
      "difficulty": "Easy/Medium/Hard",
      "url": "link",
      "prompt": "full problem statement"
    }
    """

    response = client.chat.completions.create(
        model="llama-3.1-8b-instant",
        messages=[{"role": "user", "content": prompt}],
        temperature=0.7
    )

    raw = response.choices[0].message.content.strip()
    return extract_json(raw)


# ----------------------------------------
# STEP 2 — Solve LeetCode Problem
# ----------------------------------------
def solve_question(q):
    prompt = f"""
    Solve the following LeetCode problem.

    Title: {q['title']}
    Difficulty: {q['difficulty']}
    URL: {q['url']}
    Problem:
    {q['prompt']}

    STRICT INSTRUCTIONS:
    - Output ONLY JSON.
    - Do NOT include ```json, ``` or markdown.
    - Do NOT include comments outside JSON.

    REQUIRED FORMAT:
    {{
      "python": "full python solution",
      "java": "full java solution",
      "explanation": "detailed explanation with complexities"
    }}
    """

    response = client.chat.completions.create(
        model="llama-3.1-8b-instant",
        messages=[{"role": "user", "content": prompt}],
        temperature=0.3
    )

    raw = response.choices[0].message.content.strip()
    return extract_json(raw)


# ----------------------------------------
# STEP 3 — Write Output to Files
# ----------------------------------------
def write_files(question, solutions):
    today = datetime.date.today().isoformat()
    folder = Path(f"solutions/{today}")
    folder.mkdir(parents=True, exist_ok=True)

    # Python
    with open(folder / "solution.py", "w", encoding="utf-8") as f:
        f.write(f"# {question['title']}\n")
        f.write(f"# Difficulty: {question['difficulty']}\n")
        f.write(f"# URL: {question['url']}\n\n")
        f.write(solutions["python"])

    # Java
    with open(folder / "solution.java", "w", encoding="utf-8") as f:
        f.write(f"// {question['title']}\n")
        f.write(f"// Difficulty: {question['difficulty']}\n")
        f.write(f"// URL: {question['url']}\n\n")
        f.write(solutions["java"])

    # Explanation
    with open(folder / "explanation.md", "w", encoding="utf-8") as f:
        f.write(f"# {question['title']}\n\n")
        f.write(f"**ID:** {question['id']}\n\n")
        f.write(f"**Difficulty:** {question['difficulty']}\n\n")
        f.write(f"**URL:** {question['url']}\n\n")
        f.write("## Explanation\n\n")
        f.write(solutions["explanation"])


# ----------------------------------------
# MAIN EXECUTION
# ----------------------------------------
def main():
    print("Selecting today's LeetCode problem...")
    question = pick_question()
    print(f"Picked: {question['title']} ({question['difficulty']})")

    print("Generating solution...")
    solutions = solve_question(question)

    print("Writing files...")
    write_files(question, solutions)

    print("🎉 Daily LeetCode solution generated successfully!")


if __name__ == "__main__":
    main()