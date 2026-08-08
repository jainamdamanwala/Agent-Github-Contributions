// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public String minWindow(String s, String t) {
  if (s == null || t == null || s.length() == 0 || t.length() == 0) {
    return "";
  }
  Map<Character, Integer> tCount = new HashMap<>();
  for (char c : t.toCharArray()) {
    tCount.put(c, tCount.getOrDefault(c, 0) + 1);
  }
  int requiredChars = tCount.size();
  int left = 0;
  int minLen = Integer.MAX_VALUE;
  String minWindow = "";
  int formedChars = 0;
  Map<Character, Integer> windowCounts = new HashMap<>();
  for (int right = 0; right < s.length(); right++) {
    if (tCount.containsKey(s.charAt(right))) {
      windowCounts.put(s.charAt(right), windowCounts.getOrDefault(s.charAt(right), 0) + 1);
      if (windowCounts.get(s.charAt(right)) == tCount.get(s.charAt(right))) {
        formedChars++;
      }
    }
    while (left <= right && formedChars == requiredChars) {
      if (right - left + 1 < minLen) {
        minLen = right - left + 1;
        minWindow = s.substring(left, right + 1);
      }
      if (tCount.containsKey(s.charAt(left))) {
        windowCounts.put(s.charAt(left), windowCounts.get(s.charAt(left)) - 1);
        if (windowCounts.get(s.charAt(left)) < tCount.get(s.charAt(left))) {
          formedChars--;
        }
      }
      left++;
    }
  }
  return minWindow;
}