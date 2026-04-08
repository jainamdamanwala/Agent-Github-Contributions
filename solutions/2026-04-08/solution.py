# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

def validIPAddress(IP: str) -> str:
  parts = IP.split('.')
  if len(parts) != 4:
    return "Invalid"
  for part in parts:
    if not part.isdigit() or (len(part) > 1 and part.startswith('0')):
      return "Invalid"
    if int(part) > 255 or int(part) < 0:
      return "Invalid"
    if len(part) > 3:
      return "Invalid"
  return "Valid"