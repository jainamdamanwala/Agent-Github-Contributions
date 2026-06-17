# Reverse Linked List

**ID:** 206  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/reverse-linked-list/  

## Explanation

This problem can be solved by iterating through the linked list and reversing the direction of each node's next pointer. We use a while loop to traverse the list, and in each iteration, we update the next pointer of the current node to point to the previous node, and then update the previous node to point to the current node. This way, we effectively reverse the direction of the linked list.