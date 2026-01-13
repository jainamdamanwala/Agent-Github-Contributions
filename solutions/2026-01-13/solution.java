// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public List<Integer> findSubstring(String s, String t) {
  if (s == null || t == null) return new ArrayList<>();
  int m = s.length(), n = t.length();
  Map<Character, Integer> tCount = new HashMap<>();
  for (char c : t.toCharArray()) tCount.put(c, tCount.getOrDefault(c, 0) + 1);
  List<Integer> res = new ArrayList<>();
  for (int i = 0; i <= m - n; i++) {
    Map<Character, Integer> windowCount = new HashMap<>();
    for (int j = 0; j < n; j++) {
      char c = s.charAt(i + j);
      windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);
      if (j >= n - 1 && allMatch(windowCount, tCount)) res.add(i + 1);
    }
  }
  return res;
}

private boolean allMatch(Map<Character, Integer> windowCount, Map<Character, Integer> tCount) {
  for (Map.Entry<Character, Integer> entry : tCount.entrySet()) {
    if (!windowCount.containsKey(entry.getKey()) || windowCount.get(entry.getKey()) < entry.getValue()) return false;
  }
  return true;
}