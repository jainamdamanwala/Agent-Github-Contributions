# Reverse Linked List

**ID:** 206  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/reverse-linked-list/  

## Explanation

The problem can be solved by initializing two pointers, prev and curr, to null and the head of the linked list, respectively. Then, traverse the linked list, reversing the link of each node by setting curr.next to prev, and moving prev and curr one step forward. Finally, return the reversed linked list, which is stored in prev.