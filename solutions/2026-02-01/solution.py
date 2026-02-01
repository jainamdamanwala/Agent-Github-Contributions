# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

def validIPAddress(s: str) -> bool:
  def valid_part(part: str) -> bool:
    if len(part) > 3 or (len(part) > 1 and part[0] == '0'):
      return False
    if not part.isdigit():
      return False
    return True
  parts = s.split('.')
  if len(parts) != 4:
    return False
  for part in parts:
    if not valid_part(part):
      return False
  return True