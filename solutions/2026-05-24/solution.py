# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

def restoreIpAddresses(s: str) -> List[str]:
  def is_valid(ip: str) -> bool:
    return 0 <= int(ip) <= 255 and (len(ip) == 1 or ip[0] != '0')

  res = []
  for i in range(1, min(4, len(s))):
    for j in range(i + 1, min(i + 4, len(s))):
      for k in range(j + 1, min(j + 4, len(s))):
        ip = s[:i] + '.' + s[i:j] + '.' + s[j:k] + '.' + s[k:]
        if is_valid(s[:i]) and is_valid(s[i:j]) and is_valid(s[j:k]) and is_valid(s[k:]):
          res.append(ip)
  return res
