// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

public boolean validIPAddress(String s) {
  public boolean validPart(String part) {
    if (part.length() > 3 || (part.length() > 1 && part.charAt(0) == '0')) {
      return false;
    }
    if (!part.matches("[0-9]+")) {
      return false;
    }
    return true;
  }
  String[] parts = s.split(".");
  if (parts.length != 4) {
    return false;
  }
  for (String part : parts) {
    if (!validPart(part)) {
      return false;
    }
  }
  return true;
}