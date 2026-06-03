# Minimum Window Substring

**ID:** 76  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using the sliding window technique. We maintain a count of characters in string t and slide a window over string s. We expand the window to the right when all characters in t are found within the window. We then try to minimize the window by moving the left pointer to the right. The minimum window is the smallest substring of s that contains all characters of t.