// Minimum Window Substring
// Difficulty: Medium
// URL: https://leetcode.com/problems/minimum-window-substring/

public String minWindow(String s, String t) {
  if (t == null || s == null || t.length() == 0 || s.length() == 0) {
    return "";
  }

  int m = s.length(), n = t.length();
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

  int formedChars = 0;
  int[] windowCounts = new int[128];
  int minWindow = Integer.MAX_VALUE;
  String minWindowStr = "";

  int left = 0;
  for (int right = 0; right < m; right++) {
    char character = s.charAt(right);
    windowCounts[character]++;

    if (tCount[character] > 0 && windowCounts[character] == tCount[character]) {
      formedChars++;
    }

    while (left <= right && formedChars == requiredChars) {
      character = s.charAt(left);
      if (right - left + 1 < minWindow) {
        minWindow = right - left + 1;
        minWindowStr = s.substring(left, right + 1);
      }
      windowCounts[character]--;
      if (tCount[character] > 0 && windowCounts[character] < tCount[character]) {
        formedChars--;
      }
      left++;
    }
  }

  return minWindowStr;
}