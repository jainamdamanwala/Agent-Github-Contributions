# Minimum Window Substring
# Difficulty: Hard
# URL: https://leetcode.com/problems/minimum-window-substring/

def minWindow(s: str, t: str) -> str:
  if not s or not t:
    return ''
  t_count = {}
  s_count = {}
  for char in t:
    t_count[char] = t_count.get(char, 0) + 1
  required_chars = len(t_count)
  left = 0
  min_len = float('inf')
  min_window = ''
  for right in range(len(s)):
    if s[right] in t_count:
      s_count[s[right]] = s_count.get(s[right], 0) + 1
      if s_count[s[right]] == t_count[s[right]]:
        required_chars -= 1
    while required_chars == 0:
      if right - left + 1 < min_len:
        min_len = right - left + 1
        min_window = s[left:right + 1]
      if s[left] in t_count:
        s_count[s[left]] -= 1
        if s_count[s[left]] < t_count[s[left]]:
          required_chars += 1
      left += 1
  return min_window