// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public String minWindow(String s, String t) {
  if (s == null || t == null || s.length() == 0 || t.length() == 0) {
    return "";
  }
  int[] tCount = new int[128];
  for (char c : t.toCharArray()) {
    tCount[c]++;
  }
  int requiredChars = 0;
  for (int count : tCount) {
    if (count > 0) {
      requiredChars++;
    }
  }
  int left = 0;
  int minLen = Integer.MAX_VALUE;
  String minWindow = "";
  int formedChars = 0;
  int[] windowCounts = new int[128];
  for (int right = 0; right < s.length(); right++) {
    char character = s.charAt(right);
    windowCounts[character]++;
    if (tCount[character] > 0 && windowCounts[character] == tCount[character]) {
      formedChars++;
    }
    while (left <= right && formedChars == requiredChars) {
      character = s.charAt(left);
      if (right - left + 1 < minLen) {
        minLen = right - left + 1;
        minWindow = s.substring(left, right + 1);
      }
      windowCounts[character]--;
      if (tCount[character] > 0 && windowCounts[character] < tCount[character]) {
        formedChars--;
      }
      left++;
    }
  }
  return minWindow;
}