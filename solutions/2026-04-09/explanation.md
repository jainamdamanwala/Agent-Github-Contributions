# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using a sliding window approach. The idea is to maintain a window of characters in string s that contains all the characters of string t. We use two pointers, left and right, to represent the start and end of the window. We also use a map to store the count of each character in the window and in string t. When the window contains all the characters of string t, we try to minimize the window by moving the left pointer to the right. The minimum window is updated whenever we find a smaller window that contains all the characters of string t.