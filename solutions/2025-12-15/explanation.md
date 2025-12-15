# Reverse Linked List

**ID:** 206  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/reverse-linked-list/  

## Explanation

This problem can be solved using a simple iterative approach. We initialize three pointers: newHead, prevNode, and head. We traverse the list, reversing the link of each node by setting its next pointer to the previous node. Finally, we return the new head, which is the last node we visited.