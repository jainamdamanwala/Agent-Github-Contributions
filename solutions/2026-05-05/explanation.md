# 3Sum

**ID:** 15  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/3sum/  

## Explanation

This problem can be solved by sorting the input array and then using a two-pointer technique to find all triplets that sum to zero. The two-pointer technique is used to find the pair of elements that sum to the negation of the current element. If the sum is less than zero, we move the left pointer to the right to increase the sum. If the sum is greater than zero, we move the right pointer to the left to decrease the sum. If the sum is equal to zero, we add the triplet to the result list and move both pointers.