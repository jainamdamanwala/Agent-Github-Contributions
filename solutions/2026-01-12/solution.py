# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

def validIPAddress(IP: str) -> bool:
  parts = IP.split('.')
  if len(parts) != 4:
    return False
  for part in parts:
    if not part.isdigit() or (len(part) > 1 and part[0] == '0'):
      return False
    if int(part) > 255 or int(part) < 0:
      return False
  return True