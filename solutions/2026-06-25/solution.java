// Valid Parentheses
// Difficulty: Medium
// URL: https://leetcode.com/problems/valid-parentheses/

public boolean validParentheses(String s) {
  Stack<Character> stack = new Stack<>();
  Map<Character, Character> bracketMap = new HashMap<>();
  bracketMap.put(')', '(');
  bracketMap.put('}', '{');
  bracketMap.put(']', '[');
  for (char c : s.toCharArray()) {
    if (bracketMap.containsValue(c)) {
      stack.push(c);
    } else if (bracketMap.containsKey(c)) {
      if (stack.isEmpty() || bracketMap.get(c) != stack.pop()) {
        return false;
      }
    }
  }
  return stack.isEmpty();
}