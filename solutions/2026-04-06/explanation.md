# Linked List Cycle

**ID:** 141  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/linked-list-cycle/  

## Explanation

This problem can be solved using the Floyd's Tortoise and Hare algorithm. The idea is to have two pointers, one moving twice as fast as the other. If there is a cycle, the fast pointer will eventually catch up to the slow pointer. If there is no cycle, the fast pointer will reach the end of the linked list.