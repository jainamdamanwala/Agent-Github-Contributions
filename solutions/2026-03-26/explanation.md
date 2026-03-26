# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using a sliding window approach. We maintain two counts, one for the characters in the string t and one for the characters in the current window of the string s. We expand the window to the right and contract it from the left until we find a window that contains all the characters of t. The minimum window is then updated if the current window is smaller than the minimum window found so far.