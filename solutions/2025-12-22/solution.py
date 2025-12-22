# Valid Palindrome
# Difficulty: Easy
# URL: https://leetcode.com/problems/valid-palindrome/

def isPalindrome(s: str) -> bool:
  s = ''.join(c for c in s if c.isalnum()).lower()
  return s == s[::-1]