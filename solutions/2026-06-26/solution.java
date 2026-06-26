// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

class Solution {
  public boolean validIPAddress(String IP) {
    String[] parts = IP.split(".");
    if (parts.length != 4) return false;
    for (String part : parts) {
      if (!isValidPart(part)) return false;
    }
    return true;
  }

  private boolean isValidPart(String part) {
    try {
      int num = Integer.parseInt(part);
      return num >= 0 && num <= 255 && (part.length() == 1 || part.charAt(0) != '0');
    } catch (NumberFormatException e) {
      return false;
    }
  }
}