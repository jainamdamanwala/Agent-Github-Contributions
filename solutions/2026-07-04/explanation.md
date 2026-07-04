# Remove Linked List Elements

**ID:** 206  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/remove-linked-list-elements/  

## Explanation

This problem can be solved by using a dummy node. The dummy node is used to simplify the code and avoid dealing with the head node separately. We iterate through the linked list, and if we encounter a node with the given value, we skip it by updating the next pointer of the previous node. If we don't encounter a node with the given value, we move to the next node. Finally, we return the next node of the dummy node, which is the new head of the linked list.