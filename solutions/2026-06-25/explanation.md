# Valid Parentheses

**ID:** 20  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/valid-parentheses/  

## Explanation

This problem can be solved using a stack data structure. We iterate through the string and for each character, we check if it's an opening bracket. If it is, we push it onto the stack. If it's a closing bracket, we check if the stack is empty or if the top of the stack doesn't match the closing bracket. If either condition is true, we return false. If we've iterated through the entire string and the stack is empty, we return true. Otherwise, we return false.