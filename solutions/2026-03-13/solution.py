# Minimum Window Substring
# Difficulty: Hard
# URL: https://leetcode.com/problems/minimum-window-substring/

class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not s or not t:
            return ''

        t_count = {}
        for char in t:
            t_count[char] = t_count.get(char, 0) + 1

        required = len(t_count)
        l, r = 0, 0
        formed = 0
        window_counts = {}

        ans = float('inf'), ans_l = 0, ans_r = 0

        while r < len(s):
            character = s[r]
            window_counts[character] = window_counts.get(character, 0) + 1

            if character in t_count and window_counts[character] == t_count[character]:
                formed += 1

            while l <= r and formed == required:
                character = s[l]

                if r - l + 1 < ans:
                    ans = r - l + 1
                    ans_l = l
                    ans_r = r

                window_counts[character] -= 1
                if character in t_count and window_counts[character] < t_count[character]:
                    formed -= 1

                l += 1

            r += 1

        return '' if ans == float('inf') else s[ans_l:ans_r + 1]
