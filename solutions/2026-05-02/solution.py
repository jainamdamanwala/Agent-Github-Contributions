# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

def validate_ip_address(ip: str) -> str:
  if '.' in ip:
    parts = ip.split('.')
    if len(parts) != 4:
      return 'neither'
    for part in parts:
      if not part.isdigit() or not 0 <= int(part) <= 255 or (len(part) > 1 and part[0] == '0'):
        return 'neither'
    return 'IPv4'
  elif ':' in ip:
    parts = ip.split(':')
    if len(parts) != 8:
      return 'neither'
    for part in parts:
      if len(part) > 4 or (not part.isdigit() and not all(c in 'abcdefABCDEF' for c in part)):
        return 'neither'
    return 'IPv6'
  else:
    return 'neither'