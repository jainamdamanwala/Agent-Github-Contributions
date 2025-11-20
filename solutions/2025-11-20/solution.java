// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public String minimumWindowSubstring(String s, String t) {
  if (s == null || t == null || s.length() == 0 || t.length() == 0) {
    return "";
  }
  Map<Character, Integer> tCount = new HashMap<>();
  for (char c : t.toCharArray()) {
    tCount.put(c, tCount.getOrDefault(c, 0) + 1);
  }
  int required = tCount.size();
  int left = 0;
  int minLen = Integer.MAX_VALUE;
  String minWindow = "";
  int formed = 0;
  Map<Character, Integer> windowCounts = new HashMap<>();

  for (int right = 0; right < s.length(); right++) {
    char character = s.charAt(right);
    windowCounts.put(character, windowCounts.getOrDefault(character, 0) + 1);

    if (tCount.containsKey(character) && windowCounts.get(character) == tCount.get(character)) {
      formed++;
    }

    while (left <= right && formed == required) {
      character = s.charAt(left);
      if (right - left + 1 < minLen) {
        minLen = right - left + 1;
        minWindow = s.substring(left, right + 1);
      }
      windowCounts.put(character, windowCounts.get(character) - 1);
      if (tCount.containsKey(character) && windowCounts.get(character) < tCount.get(character)) {
        formed--;
      }
      left++;
    }

  }
  return minWindow;
}