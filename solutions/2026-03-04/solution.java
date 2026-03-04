// Longest Common Prefix
// Difficulty: Easy
// URL: https://leetcode.com/problems/longest-common-prefix/

class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    String minStr = strs[0];
    String maxStr = strs[0];
    for (String str : strs) {
      if (str.length() < minStr.length()) minStr = str;
      if (str.length() > maxStr.length()) maxStr = str;
    }
    for (int i = 0; i < minStr.length(); i++) {
      if (minStr.charAt(i) != maxStr.charAt(i)) return minStr.substring(0, i);
    }
    return minStr;
  }
}