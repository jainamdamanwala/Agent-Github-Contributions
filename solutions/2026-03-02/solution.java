// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public String minWindow(String s, String t) {
  if (s == null || t == null || s.length() == 0 || t.length() == 0) {
    return "";
  }
  int[] t_count = new int[128];
  for (char c : t.toCharArray()) {
    t_count[c]++;
  }
  int required_chars = countNonZero(t_count);
  int left = 0;
  int min_len = Integer.MAX_VALUE;
  String min_window = "";
  int formed_chars = 0;
  int[] window_counts = new int[128];
  for (int right = 0; right < s.length(); right++) {
    if (t_count[s.charAt(right)] > 0) {
      window_counts[s.charAt(right)]++;
      if (window_counts[s.charAt(right)] == t_count[s.charAt(right)]) {
        formed_chars++;
      }
    }
    while (left <= right && formed_chars == required_chars) {
      if (right - left + 1 < min_len) {
        min_len = right - left + 1;
        min_window = s.substring(left, right + 1);
      }
      if (t_count[s.charAt(left)] > 0) {
        window_counts[s.charAt(left)]--;
        if (window_counts[s.charAt(left)] < t_count[s.charAt(left)]) {
          formed_chars--;
        }
      }
      left++;
    }
  }
  return min_window;
}
private int countNonZero(int[] arr) {
  int count = 0;
  for (int i : arr) {
    if (i > 0) {
      count++;
    }
  }
  return count;
}