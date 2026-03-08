// Valid Palindrome
// Difficulty: Easy
// URL: https://leetcode.com/problems/valid-palindrome/

public boolean validPalindrome(String s) {
  Map<Character, Integer> count = new HashMap<>();
  for (char c : s.toCharArray()) {
    count.put(c, count.getOrDefault(c, 0) + 1);
  }
  for (int val : count.values()) {
    if (val % 2 != 0) {
      return false;
    }
  }
  return true;
}