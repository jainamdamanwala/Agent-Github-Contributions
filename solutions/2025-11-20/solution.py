# Minimum Window Substring
# Difficulty: Hard
# URL: https://leetcode.com/problems/minimum-window-substring/

def minimumWindowSubstring(s: str, t: str) -> str:
  if not s or not t:
    return ''
  t_count = Counter(t)
  required = len(t_count)
  left = 0
  min_len = float('inf')
  min_window = ''
  formed = 0
  window_counts = {}

  for right in range(len(s)):
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