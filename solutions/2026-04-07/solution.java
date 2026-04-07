// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        int[] tCount = new int[128];
        int[] sCount = new int[128];
        for (char c : t.toCharArray()) {
            tCount[c]++;
        }

        int required = t.length();
        int formed = 0;
        int[] windowCounts = new int[128];
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        String minWindow = "";

        for (int r = 0; r < s.length(); r++) {
            char character = s.charAt(r);
            windowCounts[character]++;

            if (tCount[character] > 0 && windowCounts[character] == tCount[character]) {
                formed++;
            }

            while (l <= r && formed == required) {
                character = s.charAt(l);
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minWindow = s.substring(l, r + 1);
                }
                windowCounts[character]--;
                if (tCount[character] > 0 && windowCounts[character] < tCount[character]) {
                    formed--;
                }
                l++;
            }

        }
        return minWindow;
    }
}