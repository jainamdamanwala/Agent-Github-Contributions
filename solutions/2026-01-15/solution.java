// Longest Substring Without Repeating Characters
// Difficulty: Medium
// URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/

public int lengthOfLongestSubstring(String s) {
  Set<Character> char_set = new HashSet<>();
  int left = 0;
  int max_len = 0;
  for (int right = 0; right < s.length(); right++) {
    while (char_set.contains(s.charAt(right))) {
      char_set.remove(s.charAt(left));
      left++;
    }
    char_set.add(s.charAt(right));
    max_len = Math.max(max_len, right - left + 1);
  }
  return max_len;
}