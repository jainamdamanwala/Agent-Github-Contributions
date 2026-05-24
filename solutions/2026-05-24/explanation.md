# Validate IP Address

**ID:** 93  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/validate-ip-address/  

## Explanation

This problem can be solved by generating all possible IP addresses and checking if they are valid. We use three nested loops to generate all possible IP addresses. We use a helper function is_valid to check if a string is a valid IP segment. A string is valid if it is between 0 and 255, or if it is a single digit and not 0.