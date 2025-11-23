# Reverse Linked List

**ID:** 206  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/reverse-linked-list/  

## Explanation

This problem can be solved iteratively by keeping track of the previous node and the current node. In each iteration, we update the next pointer of the current node to point to the previous node, and then move to the next node in the list. The loop continues until we reach the end of the list, at which point the previous node is the new head of the reversed list.