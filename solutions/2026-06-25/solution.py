# Valid Parentheses
# Difficulty: Medium
# URL: https://leetcode.com/problems/valid-parentheses/

def validParentheses(s: str) -> bool:
  stack = []
  bracket_map = {')': '(', '}': '{', ']': '['}
  for c in s:
    if c in bracket_map.values():
      stack.append(c)
    elif c in bracket_map.keys():
      if not stack or bracket_map[c] != stack.pop():
        return False
  return not stack