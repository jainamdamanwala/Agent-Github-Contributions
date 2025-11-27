// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

class Solution {
  public boolean validIPAddress(String ip) {
    boolean[] valid = new boolean[4];
    String[] parts = ip.split(".");
    if (parts.length != 4) return false;
    for (int i = 0; i < 4; i++) {
      if (!isValidPart(parts[i])) return false;
      valid[i] = true;
    }
    return true;
  }

  private boolean isValidPart(String part) {
    if (part.length() <= 0 || part.length() > 3) return false;
    if (part.charAt(0) == '0' && part.length() > 1) return false;
    for (char c : part.toCharArray()) {
      if (!Character.isDigit(c)) return false;
    }
    return true;
  }
}