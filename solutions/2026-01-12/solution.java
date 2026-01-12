// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

public boolean validIPAddress(String IP) {
  String[] parts = IP.split(".");
  if (parts.length != 4) return false;
  for (String part : parts) {
    if (part.length() > 1 && part.charAt(0) == '0') return false;
    for (char c : part.toCharArray()) {
      if (!Character.isDigit(c)) return false;
    }
    int num = Integer.parseInt(part);
    if (num > 255 || num < 0) return false;
  }
  return true;
}