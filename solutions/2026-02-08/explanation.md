# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using the sliding window technique. We maintain a count of characters in string t in a hash map. We also keep track of the minimum window substring found so far. We expand the window to the right and when all characters in t are found, we try to shrink the window from the left. We update the minimum window substring if the current window is smaller.