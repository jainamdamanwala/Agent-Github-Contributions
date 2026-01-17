// Valid Anagram
// Difficulty: Medium
// URL: https://leetcode.com/problems/valid-anagram/

class Solution {
  public boolean backspaceCompare(String s, String t) {
    return buildString(s).equals(buildString(t));
  }

  private String buildString(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (c != '#') {
        sb.append(c);
      } else {
        if (sb.length() > 0) {
          sb.deleteCharAt(sb.length() - 1);
        }
      }
    }
    return sb.toString();
  }
}