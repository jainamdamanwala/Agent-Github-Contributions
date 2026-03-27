// Valid Palindrome
// Difficulty: Easy
// URL: https://leetcode.com/problems/valid-palindrome/

public boolean canPermutePalindrome(String s) {
  int[] char_count = new int[128];
  for (char c : s.toCharArray()) {
    char_count[c]++;
  }
  int odd_count = 0;
  for (int count : char_count) {
    if (count % 2 != 0) {
      odd_count++;
    }
  }
  return odd_count <= 1;
}