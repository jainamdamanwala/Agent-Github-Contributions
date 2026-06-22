# Valid Palindrome
# Difficulty: Easy
# URL: https://leetcode.com/problems/valid-palindrome/

def validPalindrome(s: str) -> bool:
  def is_palindrome(s: str) -> bool:
    return s == s[::-1]
  return is_palindrome(s) or (is_palindrome(s[:-1]) and is_palindrome(s[1:]))