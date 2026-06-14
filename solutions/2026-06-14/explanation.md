# Minimum Window Substring

**ID:** 76  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/minimum-window-substring/  

## Explanation

This problem is a variation of the minimum window substring problem. We use a queue to store the current number of apples and perform operations on it. The operations are represented by the pairs of integers [eat, throw] where eat is the number of apples we eat and throw is the number of apples we throw away. We keep track of the number of operations and return it when we reach the target number of apples.