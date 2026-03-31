# First Missing Positive

**ID:** 41  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/first-missing-positive/  

## Explanation

The problem can be solved by using a two-step approach. First, we sort the array and then find the first missing positive integer. However, this approach has a time complexity of O(n log n). A more efficient approach is to use a hash set to store the numbers in the array and then find the first missing positive integer. This approach has a time complexity of O(n). Another approach is to use a modified Dutch National Flag algorithm to sort the array in place and then find the first missing positive integer. This approach also has a time complexity of O(n).