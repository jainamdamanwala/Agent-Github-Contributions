# Minimum Window Substring
# Difficulty: Hard
# URL: https://leetcode.com/problems/minimum-window-substring/

def minWindow(s, t):
  if not s or not t:
    return ""
  m, n = len(s), len(t)
  t_count = {}
  for char in t:
    t_count[char] = t_count.get(char, 0) + 1
  required = len(t_count)
  left = 0
  min_len = float('inf')
  min_window = ""
  formed = 0
  window_counts = {}
  for right in range(m):
    character = s[right]
    window_counts[character] = window_counts.get(character, 0) + 1
    if character in t_count and window_counts[character] == t_count[character]:
      formed += 1
    while left <= right and formed == required:
      character = s[left]
      if right - left + 1 < min_len:
        min_len = right - left + 1
        min_window = s[left:right + 1]
      window_counts[character] -= 1
      if character in t_count and window_counts[character] < t_count[character]:
        formed -= 1
      left += 1
  return min_window