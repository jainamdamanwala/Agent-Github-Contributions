// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public String minWindow(String s, String t) {
  if (s == null || t == null || s.length() == 0 || t.length() == 0) {
    return "";
  }
  int[] tCount = new int[128];
  int[] sCount = new int[128];
  for (char c : t.toCharArray()) {
    tCount[c]++;
  }
  int requiredChars = t.length();
  int left = 0;
  int minLen = Integer.MAX_VALUE;
  String minWindow = "";
  for (int right = 0; right < s.length(); right++) {
    if (tCount[s.charAt(right)] > 0) {
      sCount[s.charAt(right)]++;
      if (sCount[s.charAt(right)] == tCount[s.charAt(right)]) {
        requiredChars--;
      }
    }
    while (requiredChars == 0) {
      if (right - left + 1 < minLen) {
        minLen = right - left + 1;
        minWindow = s.substring(left, right + 1);
      }
      if (tCount[s.charAt(left)] > 0) {
        sCount[s.charAt(left)]--;
        if (sCount[s.charAt(left)] < tCount[s.charAt(left)]) {
          requiredChars++;
        }
      }
      left++;
    }
  }
  return minWindow;
}