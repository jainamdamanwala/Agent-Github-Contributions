# Remove Linked List Elements

**ID:** 203  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/remove-linked-list-elements/  

## Explanation

This problem can be solved by using a dummy node to simplify the code. We traverse the linked list with two pointers, prev and curr. If curr's value is equal to the given value, we skip it by updating prev's next pointer. Otherwise, we move both pointers forward.