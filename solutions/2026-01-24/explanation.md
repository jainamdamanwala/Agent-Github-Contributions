# Remove Linked List Elements

**ID:** 143  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/remove-linked-list-elements/  

## Explanation

This problem can be solved by using a dummy node. The dummy node is used to simplify the code and avoid dealing with the case where the head of the list is the node to be removed. We iterate through the list, and if we encounter a node with the value to be removed, we simply skip it by updating the next pointer of the previous node. If we don't encounter a node with the value to be removed, we move to the next node. Finally, we return the next node of the dummy node, which is the new head of the list.