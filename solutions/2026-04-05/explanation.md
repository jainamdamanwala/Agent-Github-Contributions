# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using a sliding window approach. We maintain a count of characters in the string t and a window of characters in the string s. We expand the window to the right and shrink it from the left. When the window contains all characters of t, we update the minimum window if the current window is smaller. We use a hash map to store the count of characters in t and another hash map to store the count of characters in the current window.