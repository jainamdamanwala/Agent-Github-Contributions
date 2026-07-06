# Minimum Window Substring

**ID:** 76  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using a sliding window approach. The idea is to maintain a window of characters in the string s that contains all the characters of the string t in sorted order. We use two arrays, t_count and window_counts, to keep track of the count of each character in the string t and the window respectively. We also maintain two variables, formed_chars and required_chars, to keep track of the number of characters in the window that are present in the string t and the total number of characters in the string t respectively. We start by iterating over the string s and expanding the window to the right. When the window contains all the characters of the string t, we try to shrink the window from the left. We keep track of the minimum window substring that contains all the characters of the string t in sorted order.