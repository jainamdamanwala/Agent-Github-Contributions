// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

public String validIPAddress(String s) {
  public boolean isValidPart(String part) {
    if (part.length() > 1 && part.startsWith("0")) return false;
    if (!part.matches("[0-9]+")) return false;
    return Integer.parseInt(part) <= 255 && Integer.parseInt(part) >= 0;
  }
  String[] parts = s.split(".");
  if (parts.length != 4) return "Invalid";
  for (String part : parts) {
    if (!isValidPart(part)) return "Invalid";
  }
  return "Valid";
}