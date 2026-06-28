# Validate Parentheses

**ID:** 20  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/validate-parentheses/  

## Explanation

This problem can be solved using a stack data structure. We iterate over the string, and for each character, we check if it's an opening bracket. If it is, we push it onto the stack. If it's a closing bracket, we check if the stack is empty or if the top of the stack doesn't match the current closing bracket. If either condition is true, we return false. Finally, we return whether the stack is empty, indicating that all brackets were matched correctly.