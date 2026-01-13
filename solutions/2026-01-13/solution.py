# Minimum Window Substring
# Difficulty: Hard
# URL: https://leetcode.com/problems/minimum-window-substring/

def findSubstring(s, t): 
  if not s or not t: return [] 
  m, n = len(s), len(t) 
  t_count = {c: t.count(c) for c in t} 
  res = [] 
  for i in range(m - n + 1): 
    window = s[i:i+n] 
    window_count = {c: window.count(c) for c in window} 
    if all(window_count[c] <= t_count[c] for c in t_count): 
      res.append(i + 1) 
  return res