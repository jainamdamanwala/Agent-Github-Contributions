# Longest Palindromic Substring

**ID:** 5  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/longest-palindromic-substring/  

## Explanation

This problem can be solved by expanding around the center of a potential palindrome. We consider both odd and even length palindromes. For each character in the string, we expand around it to find the longest palindrome. We keep track of the longest palindrome found so far and return it at the end.