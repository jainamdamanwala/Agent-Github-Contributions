// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

public class Solution {
  public String validIPAddress(String IP) {
    if (IP.contains(".")) {
      String[] parts = IP.split(".");
      if (parts.length != 4) return "neither";
      for (String part : parts) {
        if (!part.matches("[0-9]+") || !part.matches("[0-9]{1,2}")) return "neither";
      }
      for (String part : parts) {
        if (!part.matches("[0-9]{1,3}")) return "neither";
      }
      return "IPv4";
    } else if (IP.contains(":")) {
      String[] parts = IP.split(":");
      if (parts.length != 8) return "neither";
      for (String part : parts) {
        if (part.length() > 4 || !part.matches("[0-9a-fA-F]+")) return "neither";
      }
      return "IPv6";
    } else {
      return "neither";
    }
  }
}