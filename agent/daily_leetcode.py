import os
import json
import datetime
import re
from pathlib import Path
from groq import Groq

client = Groq(api_key=os.getenv("GROQ_API_KEY"))

# ---------------------------------------------------------
# JSON SANITIZER — Fix all messy model outputs into valid JSON
# ---------------------------------------------------------
def sanitize_model_output_to_json(text):
    # Remove markdown ``` blocks
    cleaned = text.replace("```json", "").replace("```", "").strip()

    # Convert triple quotes → escaped strings
    cleaned = re.sub(r'"""\s*(.*?)\s*"""', lambda m: json.dumps(m.group(1)), cleaned, flags=re.DOTALL)

    # Convert nested objects inside quotes into valid strings
    cleaned = re.sub(r'("explanation"\s*:\s*)\{(.*?)\}',
                     lambda m: f'"explanation": {json.dumps("{" + m.group(2) + "}")}',
                     cleaned,
                     flags=re.DOTALL)

    # Find JSON object
    match = re.search(r"\{.*\}", cleaned, flags=re.DOTALL)
    if not match:
        raise ValueError("Model did not return JSON.")

    json_str = match.group(0)

    # Try parsing
    try:
        return json.loads(json_str)
    except Exception as e:
        print("FINAL CLEANED JSON STRING:", json_str)
        raise e


# ---------------------------------------------------------
# Pick Question
# ---------------------------------------------------------
def pick_question():
    prompt = """
    Pick ONE real LeetCode problem.

    Difficulty distribution:
    - 50% Easy
    - 35% Medium
    - 15% Hard

    STRICT:
    - Output ONLY JSON
    - No markdown
    - No commentary

    FORMAT:
    {
      "title": "",
      "id": "",
      "difficulty": "",
      "url": "",
      "prompt": ""
    }
    """

    response = client.chat.completions.create(
        model="llama-3.1-8b-instant",
        messages=[{"role": "user", "content": prompt}],
        temperature=0.7
    )

    raw = response.choices[0].message.content.strip()
    return sanitize_model_output_to_json(raw)


# ---------------------------------------------------------
# Solve Question
# ---------------------------------------------------------
def solve_question(q):
    prompt = f"""
    Solve the LeetCode problem:

    Title: {q['title']}
    Difficulty: {q['difficulty']}
    URL: {q['url']}
    Problem:
    {q['prompt']}

    STRICT:
    - JSON ONLY
    - No markdown
    - No commentary

    FORMAT:
    {{
      "python": "string",
      "java": "string",
      "explanation": "string"
    }}
    """

    response = client.chat.completions.create(
        model="llama-3.1-8b-instant",
        messages=[{"role": "user", "content": prompt}],
        temperature=0.3
    )

    raw = response.choices[0].message.content.strip()
    return sanitize_model_output_to_json(raw)


# ---------------------------------------------------------
# Write files
# ---------------------------------------------------------
def write_files(question, solutions):
    today = datetime.date.today().isoformat()
    folder = Path(f"solutions/{today}")
    folder.mkdir(parents=True, exist_ok=True)

    with open(folder / "solution.py", "w") as f:
        f.write(f"# {question['title']}\n# Difficulty: {question['difficulty']}\n# URL: {question['url']}\n\n")
        f.write(solutions["python"])

    with open(folder / "solution.java", "w") as f:
        f.write(f"// {question['title']}\n// Difficulty: {question['difficulty']}\n// URL: {question['url']}\n\n")
        f.write(solutions["java"])

    with open(folder / "explanation.md", "w") as f:
        f.write(f"# {question['title']}\n\n")
        f.write(f"**ID:** {question['id']}  \n")
        f.write(f"**Difficulty:** {question['difficulty']}  \n")
        f.write(f"**URL:** {question['url']}  \n\n")
        f.write("## Explanation\n\n")
        f.write(solutions["explanation"])


# ---------------------------------------------------------
# Main
# ---------------------------------------------------------
def main():
    print("Selecting today's LeetCode problem...")
    q = pick_question()
    print(f"Picked: {q['title']} ({q['difficulty']})")

    print("Generating solution...")
    solutions = solve_question(q)

    print("Writing files...")
    write_files(q, solutions)

    print("🎉 Daily LeetCode solution generated successfully!")


if __name__ == "__main__":
    main()