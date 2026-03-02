# Minimum Window Substring
# Difficulty: Hard
# URL: https://leetcode.com/problems/minimum-window-substring/

def minWindow(s: str, t: str) -> str:
  if not s or not t:
    return ""
  t_count = {}
  for char in t:
    t_count[char] = t_count.get(char, 0) + 1
  required_chars = len(t_count)
  left = 0
  min_len = float("inf")
  min_window = ""
  formed_chars = 0
  window_counts = {}
  for right in range(len(s)):
    if s[right] in t_count:
      window_counts[s[right]] = window_counts.get(s[right], 0) + 1
      if window_counts[s[right]] == t_count[s[right]]:
        formed_chars += 1
    while left <= right and formed_chars == required_chars:
      if right - left + 1 < min_len:
        min_len = right - left + 1
        min_window = s[left:right + 1]
      if s[left] in t_count:
        window_counts[s[left]] -= 1
        if window_counts[s[left]] < t_count[s[left]]:
          formed_chars -= 1
      left += 1
  return min_window