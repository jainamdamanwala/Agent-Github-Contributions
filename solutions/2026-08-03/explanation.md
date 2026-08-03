# Longest Substring Without Repeating Characters

**ID:** 3  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/longest-substring-without-repeating-characters/  

## Explanation

This problem can be solved using the sliding window technique. We use a set to store the characters in the current substring. We maintain two pointers, left and right, where left is the start of the window and right is the end of the window. We move the right pointer to the right and add the character at the right pointer to the set. If the character at the right pointer is already in the set, we move the left pointer to the right and remove the character at the left pointer from the set until the character at the right pointer is not in the set. We update the result with the maximum length of the substring without repeating characters.