# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem can be solved using the sliding window technique. The idea is to maintain a window in the string s that contains all the characters of string t. We use two pointers, l and r, to represent the start and end of the window. We also use a hash map to store the count of each character in the window and in string t.

We start by initializing the hash map for string t and the window counts. We then enter a loop where we move the end of the window to the right and update the window counts. If the count of a character in the window is equal to the count in string t, we increment the formed variable. If the formed variable is equal to the required variable (which is the number of unique characters in string t), we enter another loop where we move the start of the window to the right and update the window counts. If the size of the window is less than the minimum size found so far, we update the minimum size and the start and end indices of the window.

Finally, we return the substring of s that corresponds to the minimum window.