// Valid Palindrome
// Difficulty: Easy
// URL: https://leetcode.com/problems/valid-palindrome/

public boolean canPermutePalindrome(String s) {
  int[] charCount = new int[128]; // ASCII size
  for (char c : s.toCharArray()) {
    charCount[c]++;
  }
  int oddCount = 0;
  for (int count : charCount) {
    if (count % 2 != 0) {
      oddCount++;
    }
  }
  return oddCount <= 1;
}