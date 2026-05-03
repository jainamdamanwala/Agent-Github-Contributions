// Valid Palindrome
// Difficulty: Easy
// URL: https://leetcode.com/problems/valid-palindrome/

public boolean canPermutePalindrome(String s) {
  int[] count = new int[128];
  for (char c : s.toCharArray()) {
    count[c]++;
  }
  int oddCount = 0;
  for (int countVal : count) {
    if (countVal % 2 != 0) {
      oddCount++;
    }
  }
  return oddCount <= 1;
}