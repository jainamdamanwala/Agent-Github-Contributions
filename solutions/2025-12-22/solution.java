// Valid Palindrome
// Difficulty: Easy
// URL: https://leetcode.com/problems/valid-palindrome/

public boolean isPalindrome(String s) {
  s = s.replaceAll("[\W_]", "").toLowerCase();
  return s.equals(new StringBuilder(s).reverse().toString());
}