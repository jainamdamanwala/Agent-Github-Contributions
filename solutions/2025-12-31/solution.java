// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public String minWindow(String s, String t) {
  if (s == null || t == null || s.length() == 0 || t.length() == 0) {
    return "";
  }
  int m = s.length(), n = t.length();
  int[] tCount = new int[128];
  for (char c : t.toCharArray()) {
    tCount[c]++;
  }
  int required = 0;
  for (int count : tCount) {
    if (count > 0) {
      required++;
    }
  }
  int left = 0;
  int minLen = Integer.MAX_VALUE;
  String minWindow = "";
  int formed = 0;
  int[] windowCounts = new int[128];
  for (int right = 0; right < m; right++) {
    char c = s.charAt(right);
    windowCounts[c]++;
    if (tCount[c] > 0 && windowCounts[c] == tCount[c]) {
      formed++;
    }
    while (left <= right && formed == required) {
      c = s.charAt(left);
      if (right - left + 1 < minLen) {
        minLen = right - left + 1;
        minWindow = s.substring(left, right + 1);
      }
      windowCounts[c]--;
      if (tCount[c] > 0 && windowCounts[c] < tCount[c]) {
        formed--;
      }
      left++;
    }
  }
  return minWindow;
}