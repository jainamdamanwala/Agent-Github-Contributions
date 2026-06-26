# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

def validate_ip(ip: str) -> bool:
  def is_valid_part(part: str) -> bool:
    return 0 <= int(part) <= 255 and (len(part) == 1 or part[0] != '0')

  parts = ip.split('.')
  if len(parts) != 4:
    return False
  for part in parts:
    if not is_valid_part(part):
      return False
  return True