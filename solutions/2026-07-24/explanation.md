# Reverse Linked List

**ID:** 206  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/reverse-linked-list/  

## Explanation

To reverse a singly linked list, we can use a two-pointer approach. We initialize a previous pointer to null and a current pointer to the head of the list. In each iteration, we store the next node in a temporary variable, then update the current node's next pointer to point to the previous node. We then move the previous and current pointers one step forward. This process continues until we reach the end of the list, at which point the previous pointer will be pointing to the new head of the reversed list.