# Remove Linked List Elements

**ID:** 203  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/remove-linked-list-elements/  

## Explanation

This problem can be solved by using a dummy node to simplify the process of removing the head node. We initialize a dummy node and set its next pointer to the head of the linked list. Then we iterate through the linked list, and if we encounter a node with the given value, we simply skip it by updating the next pointer of the previous node. If we don't encounter the given value, we move on to the next node. Finally, we return the next node of the dummy node, which is the new head of the linked list.