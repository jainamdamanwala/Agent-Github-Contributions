# Binary Tree Maximum Path Sum

**ID:** 124  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/binary-tree-maximum-path-sum/  

## Explanation

This problem can be solved by using a depth-first search (DFS) approach. The idea is to calculate the maximum gain for each node, which is the maximum sum of the path from the node to a leaf node. Then, we update the maximum path sum if a new path with a larger sum is found. The base case for the DFS is when the node is null, in which case we return 0. For each node, we calculate the maximum gain for its left and right subtrees, and then update the maximum path sum if a new path with a larger sum is found. Finally, we return the maximum path sum.