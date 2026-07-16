# Validate IP Address

**ID:** 191  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/validate-ip-address/  

## Explanation

This problem can be solved using a brute force approach with three nested loops to try all possible combinations of segments. The isValid function checks if a segment is valid by ensuring it does not start with 0 and its value is between 0 and 255. The result is a list of all valid IP addresses that can be formed from the given string.