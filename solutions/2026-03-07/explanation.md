# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using the sliding window technique. We maintain two counts of characters, one for the string t and one for the current window in string s. We expand the window to the right until we have all characters of t in the window, then we try to minimize the window by moving the left pointer to the right. The minimum window is the one with the smallest length that contains all characters of t.