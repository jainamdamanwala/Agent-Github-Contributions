# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

def validIPAddress(s: str) -> str: 
  def is_valid_part(part: str) -> bool: 
    if len(part) > 1 and part.startswith('0'): return False 
    if not part.isdigit(): return False 
    return 0 <= int(part) <= 255 
  parts = s.split('.') 
  if len(parts) != 4: return 'Invalid' 
  for part in parts: 
    if not is_valid_part(part): return 'Invalid' 
  return 'Valid'