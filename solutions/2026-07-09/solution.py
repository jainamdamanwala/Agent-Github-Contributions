# Valid Palindrome
# Difficulty: Easy
# URL: https://leetcode.com/problems/valid-palindrome/

def canPermutePalindrome(s: str) -> bool:
  count = {}
  for char in s:
    count[char] = count.get(char, 0) + 1
  odd_count = 0
  for k in count:
    if count[k] % 2 != 0:
      odd_count += 1
  return odd_count <= 1