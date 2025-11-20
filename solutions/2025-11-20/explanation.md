# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using the sliding window technique. We maintain a window of characters in the string s that contains all the characters of string t. We use two pointers, left and right, to represent the start and end of the window. We also use a map to count the frequency of characters in the window and in string t. We expand the window to the right by moving the right pointer and contract the window from the left by moving the left pointer. We update the minimum window substring whenever we find a smaller window that contains all the characters of string t.