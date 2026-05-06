# Longest Palindromic Substring
# Difficulty: Medium
# URL: https://leetcode.com/problems/longest-palindromic-substring/

def longest_palindromic_substring(s: str) -> str:
    def expand_around_center(s: str, left: int, right: int) -> str:
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        return s[left + 1:right]
    longest = ''
    for i in range(len(s)):
        # odd length
        odd = expand_around_center(s, i, i)
        if len(odd) > len(longest):
            longest = odd
        # even length
        even = expand_around_center(s, i, i + 1)
        if len(even) > len(longest):
            longest = even
    return longest