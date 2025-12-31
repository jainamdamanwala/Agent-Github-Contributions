# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved by using a sliding window approach. We maintain two counts, one for the characters in string t and one for the characters in the current window of string s. We expand the window to the right until we have all the characters of t in the window, then we shrink the window from the left until we no longer have all the characters of t in the window. We keep track of the minimum window that contains all the characters of t.