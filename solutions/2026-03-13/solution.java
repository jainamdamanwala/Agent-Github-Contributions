// Minimum Window Substring
// Difficulty: Hard
// URL: https://leetcode.com/problems/minimum-window-substring/

public class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        int[] t_count = new int[128];
        for (char c : t.toCharArray()) {
            t_count[c]++;
        }

        int required = 0;
        for (int count : t_count) {
            if (count != 0) {
                required++;
            }
        }

        int l = 0, r = 0;
        int formed = 0;
        int[] window_counts = new int[128];

        int ans = Integer.MAX_VALUE;
        int ans_l = 0;
        int ans_r = 0;

        while (r < s.length()) {
            char character = s.charAt(r);
            window_counts[character]++;

            if (t_count[character] != 0 && window_counts[character] == t_count[character]) {
                formed++;
            }

            while (l <= r && formed == required) {
                char c = s.charAt(l);

                if (r - l + 1 < ans) {
                    ans = r - l + 1;
                    ans_l = l;
                    ans_r = r;
                }

                window_counts[c]--;
                if (t_count[c] != 0 && window_counts[c] < t_count[c]) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return ans == Integer.MAX_VALUE ? "" : s.substring(ans_l, ans_r + 1);
    }
}