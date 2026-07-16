# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

def restoreIpAddresses(s: str) -> [str]:
  def is_valid(seg: str) -> bool:
    if len(seg) > 1 and seg.startswith('0'): return False
    return 0 <= int(seg) <= 255

  res = []
  for i in range(1, min(4, len(s))):
    for j in range(i + 1, min(i + 4, len(s))):
      for k in range(j + 1, min(j + 4, len(s))):
        seg1, seg2, seg3, seg4 = s[:i], s[i:j], s[j:k], s[k:]
        if is_valid(seg1) and is_valid(seg2) and is_valid(seg3) and is_valid(seg4):
          res.append('.'.join([seg1, seg2, seg3, seg4]))
  return res