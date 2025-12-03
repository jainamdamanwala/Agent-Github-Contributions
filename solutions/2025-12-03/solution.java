// Valid Palindrome
// Difficulty: Easy
// URL: https://leetcode.com/problems/valid-palindrome/

public boolean canPermutePalindrome(String s) {
  Map<Character, Integer> charCount = new HashMap<>();
  for (char c : s.toCharArray()) {
    charCount.put(c, charCount.getOrDefault(c, 0) + 1);
  }
  int oddCount = 0;
  for (int count : charCount.values()) {
    if (count % 2 != 0) {
      oddCount++;
    }
  }
  return oddCount <= 1;
}