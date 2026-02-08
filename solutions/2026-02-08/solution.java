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
  int requiredChars = countNonZero(tCount);
  int left = 0;
  int minLen = Integer.MAX_VALUE;
  String minWindow = "";
  for (int right = 0; right < s.length(); right++) {
    if (tCount[s.charAt(right)] > 0) {
      tCount[s.charAt(right)]--;
      if (tCount[s.charAt(right)] == 0) {
        requiredChars--;
      }
    }
    while (requiredChars == 0) {
      if (right - left + 1 < minLen) {
        minLen = right - left + 1;
        minWindow = s.substring(left, right + 1);
      }
      if (tCount[s.charAt(left)] > 0) {
        tCount[s.charAt(left)]++;
        if (tCount[s.charAt(left)] > 0) {
          requiredChars++;
        }
      }
      left++;
    }
  }
  return minWindow;
}

private int countNonZero(int[] a) {
  int count = 0;
  for (int i : a) {
    if (i > 0) {
      count++;
    }
  }
  return count;
}