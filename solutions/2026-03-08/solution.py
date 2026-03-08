# Valid Palindrome
# Difficulty: Easy
# URL: https://leetcode.com/problems/valid-palindrome/

def validPalindrome(s: str) -> bool:
  count = {}
  for char in s:
    count[char] = count.get(char, 0) + 1
  return all(val % 2 == 0 for val in count.values())