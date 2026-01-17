# Valid Anagram
# Difficulty: Medium
# URL: https://leetcode.com/problems/valid-anagram/

def isBackspaceEqual(s: str, t: str) -> bool:
  def getStr(s: str) -> str:
    res = ''
    for c in s:
      if c != '#':
        res += c
      else:
        res = res[:-1]
    return res
  return getStr(s) == getStr(t)