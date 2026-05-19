// Validate Parentheses
// Difficulty: Easy
// URL: https://leetcode.com/problems/validate-parentheses/

public boolean validateParentheses(String s) {
    java.util.Stack<Character> stack = new java.util.Stack<>();
    java.util.HashMap<Character, Character> bracketMap = new java.util.HashMap<>();
    bracketMap.put(')', '(');
    bracketMap.put('}', '{');
    bracketMap.put(']', '[');

    for (char c : s.toCharArray()) {
        if (bracketMap.values().contains(c)) {
            stack.push(c);
        } else if (bracketMap.containsKey(c)) {
            if (stack.isEmpty() || bracketMap.get(c) != stack.pop()) {
                return false;
            }
        }
    }

    return stack.isEmpty();
}