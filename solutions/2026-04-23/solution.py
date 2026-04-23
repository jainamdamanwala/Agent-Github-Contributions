# Valid Palindrome
# Difficulty: Easy
# URL: https://leetcode.com/problems/valid-palindrome/

def canPermutePalindrome(s: str) -> bool:
  return len(s) % 2 == 0 or
         len(s.replace(' ', '').lower()) -
         len(set(s.replace(' ', '').lower())) <= 1