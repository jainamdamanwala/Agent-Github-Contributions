# Minimum Window Substring
# Difficulty: Hard
# URL: https://leetcode.com/problems/minimum-window-substring/

class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not s or not t:
            return ''

        t_count = {}
        s_count = {}
        for char in t:
            t_count[char] = t_count.get(char, 0) + 1

        required = len(t_count)
        formed = 0
        window_counts = {}
        l = 0
        min_len = float('inf')
        min_window = ''

        for r in range(len(s)):
            character = s[r]
            window_counts[character] = window_counts.get(character, 0) + 1

            if character in t_count and window_counts[character] == t_count[character]:
                formed += 1

            while l <= r and formed == required:
                character = s[l]
                if r - l + 1 < min_len:
                    min_len = r - l + 1
                    min_window = s[l:r + 1]
                window_counts[character] -= 1
                if character in t_count and window_counts[character] < t_count[character]:
                    formed -= 1
                l += 1

        return min_window