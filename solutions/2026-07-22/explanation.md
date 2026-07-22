# Binary Search

**ID:** 704  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/binary-search/  

## Explanation

This problem can be solved using binary search. We start by initializing two pointers, left and right, to the start and end of the array respectively. We then enter a while loop that continues until left is greater than right. In each iteration, we calculate the mid index and compare the value at the mid index to the target. If they are equal, we return the mid index. If the value at the mid index is less than the target, we update the left pointer to mid + 1. If the value at the mid index is greater than the target, we update the right pointer to mid - 1. If the loop ends without finding the target, we return -1.