// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

class Solution {
  public List<String> restoreIpAddresses(String s) {
    List<String> res = new ArrayList<>();
    for (int i = 1; i <= Math.min(4, s.length()); i++) {
      for (int j = i + 1; j <= Math.min(i + 4, s.length()); j++) {
        for (int k = j + 1; k <= Math.min(j + 4, s.length()); k++) {
          String seg1 = s.substring(0, i);
          String seg2 = s.substring(i, j);
          String seg3 = s.substring(j, k);
          String seg4 = s.substring(k);
          if (isValid(seg1) && isValid(seg2) && isValid(seg3) && isValid(seg4)) {
            res.add(seg1 + '.' + seg2 + '.' + seg3 + '.' + seg4);
          }
        }
      }
    }
    return res;
  }

  private boolean isValid(String seg) {
    if (seg.length() > 1 && seg.startsWith("0")) return false;
    return 0 <= Integer.parseInt(seg) <= 255;
  }
}