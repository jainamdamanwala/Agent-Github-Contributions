# Reverse Linked List

**ID:** 206  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/reverse-linked-list/  

## Explanation

To reverse a singly linked list, we can use three pointers: prev, curr, and next. We initialize prev to null and curr to the head of the list. Then we traverse the list, storing the next node in next_node, reversing the link by setting curr.next to prev, and moving the pointers one step forward. Finally, we return the new head, which is stored in prev.