# Add One Row to Tree

**ID:** 623  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/add-one-row-to-tree/  

## Explanation

This problem can be solved by performing a depth-first search (DFS) on the binary tree. We start at the root node and recursively traverse the tree, adding a new node with the given value at the specified depth. If the current depth is one less than the target depth, we add the new nodes to the left and right children of the current node. If the current node is null, we simply return without doing anything.