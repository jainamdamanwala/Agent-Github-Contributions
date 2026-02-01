# Validate IP Address

**ID:** 1916  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/validate-ip-address/  

## Explanation

This problem can be solved by splitting the input string into parts using the dot as a delimiter and then validating each part. A valid part should have a length between 1 and 3, should not start with zero unless it's zero itself, and should be a number.