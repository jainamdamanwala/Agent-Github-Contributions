# Validate Parentheses

**ID:** 20  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/validate-parentheses/  

## Explanation

This problem can be solved using a stack data structure. We iterate over the input string and push opening brackets onto the stack. When we encounter a closing bracket, we check if the top of the stack contains the corresponding opening bracket. If not, or if the stack is empty, we return false. Finally, we return whether the stack is empty, indicating all brackets were properly closed.