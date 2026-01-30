# Valid Anagram

**ID:** 242  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/valid-anagram/  

## Explanation

This problem can be solved by treating the backspace operation as a stack operation. We iterate over the string and for each character, if it's not a backspace, we push it onto the stack. If it's a backspace and the stack is not empty, we pop the top element from the stack. Finally, we join the elements in the stack to form the processed string. We then compare the processed strings of the two input strings.