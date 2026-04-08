// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

public String validIPAddress(String IP) {
  String[] parts = IP.split(".");
  if (parts.length != 4) return "Invalid";
  for (String part : parts) {
    if (!part.matches("[0-9]+") || (part.length() > 1 && part.startsWith("0"))) return "Invalid";
    int num = Integer.parseInt(part);
    if (num > 255 || num < 0) return "Invalid";
    if (part.length() > 3) return "Invalid";
  }
  return "Valid";
}