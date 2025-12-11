# Valid Parentheses
# Difficulty: Medium
# URL: https://leetcode.com/problems/valid-parentheses/

def validParentheses(s: str) -> bool:
  stack = []
  bracket_map = {')': '(', '}': '{', ']': '['}
  for char in s:
    if char in bracket_map.values():
      stack.append(char)
    elif char in bracket_map:
      if not stack or bracket_map[char] != stack.pop():
        return False
  return not stack