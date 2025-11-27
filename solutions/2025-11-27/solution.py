# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

def validIPAddress(ip: str) -> bool:
  def is_valid_part(part: str) -> bool:
    if len(part) <= 0 or len(part) > 3:
      return False
    if part[0] == '0' and len(part) > 1:
      return False
    if not part.isdigit():
      return False
    return True
  parts = ip.split('.')
  if len(parts) != 4:
    return False
  for part in parts:
    if not is_valid_part(part):
      return False
  return True