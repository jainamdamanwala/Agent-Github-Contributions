# Reverse Linked List

**ID:** 206  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/reverse-linked-list/  

## Explanation

This problem can be solved by iterating through the linked list and reversing the direction of each node's next pointer. We keep track of the previous node in the list and update the next pointer of each node to point to the previous node. Finally, we return the new head of the reversed list, which is the last node we visited.