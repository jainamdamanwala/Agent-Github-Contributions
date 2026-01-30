# Valid Anagram
# Difficulty: Easy
# URL: https://leetcode.com/problems/valid-anagram/

def is_valid(s: str, t: str) -> bool:
  def process(s):
    stack = []
    for char in s:
      if char != '#':
        stack.append(char)
      elif stack:
        stack.pop()
    return ''.join(stack)
  return process(s) == process(t)