// Valid Palindrome
// Difficulty: Easy
// URL: https://leetcode.com/problems/valid-palindrome/

public boolean canPermutePalindrome(String s) {
  s = s.replaceAll(" ", "").toLowerCase();
  int count = 0;
  for (char c : s.toCharArray()) {
    if (s.indexOf(c) == s.lastIndexOf(c)) {
      count++;
    }
  }
  return s.length() % 2 == 0 || count <= 1;
}