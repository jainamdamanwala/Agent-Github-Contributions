# Validate IP Address

**ID:** 1916  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/validate-ip-address/  

## Explanation

This problem can be solved by splitting the given string into four parts using the '.' as a delimiter. Each part should be a valid IP address segment, which is a number between 0 and 255 (inclusive). The function checks each part and returns 'Invalid' if any part is not valid. If all parts are valid, it returns 'Valid'.