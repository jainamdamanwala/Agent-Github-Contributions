// Validate Parentheses
// Difficulty: Easy
// URL: https://leetcode.com/problems/validate-parentheses/

public boolean validateParentheses(String s) {
  Stack<Character> stack = new Stack<>();
  Map<Character, Character> mapping = new HashMap<>();
  mapping.put(')', '(');
  mapping.put('}', '{');
  mapping.put(']', '[');
  for (char c : s.toCharArray()) {
    if (mapping.containsValue(c)) {
      stack.push(c);
    } else if (mapping.containsKey(c)) {
      if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
        return false;
      }
    }
  }
  return stack.isEmpty();
}