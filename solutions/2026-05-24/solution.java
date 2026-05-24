// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

class Solution {
  public List<String> restoreIpAddresses(String s) {
    List<String> res = new ArrayList<>();
    for (int i = 1; i <= Math.min(3, s.length()); i++) {
      for (int j = i + 1; j <= Math.min(i + 3, s.length()); j++) {
        for (int k = j + 1; k <= Math.min(j + 3, s.length()); k++) {
          String ip = s.substring(0, i) + '.' + s.substring(i, j) + '.' + s.substring(j, k) + '.' + s.substring(k);
          if (isValid(s.substring(0, i)) && isValid(s.substring(i, j)) && isValid(s.substring(j, k)) && isValid(s.substring(k))) {
            res.add(ip);
          }
        }
      }
    }
    return res;
  }

  public boolean isValid(String s) {
    return (s.length() == 1 && s.charAt(0) != '0') || (s.length() > 1 && 0 <= Integer.parseInt(s) && Integer.parseInt(s) <= 255);
  }
}