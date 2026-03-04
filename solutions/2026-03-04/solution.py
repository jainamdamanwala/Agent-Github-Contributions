# Longest Common Prefix
# Difficulty: Easy
# URL: https://leetcode.com/problems/longest-common-prefix/

def longestCommonPrefix(strs): 
  if not strs: return ""
  s1 = min(strs)
  s2 = max(strs)
  for i, (c1, c2) in enumerate(zip(s1, s2)):
    if c1 != c2: return s1[:i]
  return s1