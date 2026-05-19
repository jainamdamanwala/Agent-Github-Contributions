# Validate Parentheses
# Difficulty: Easy
# URL: https://leetcode.com/problems/validate-parentheses/

def validate_parentheses(s: str) -> bool:
    stack = []
    bracket_map = {')': '(', '}': '{', ']': '['}

    for char in s:
        if char in bracket_map.values():
            stack.append(char)
        elif char in bracket_map.keys():
            if not stack or bracket_map[char] != stack.pop():
                return False

    return not stack