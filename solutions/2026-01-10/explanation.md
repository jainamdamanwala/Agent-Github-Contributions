# Valid Perfect Square

**ID:** 367  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/valid-perfect-square/  

## Explanation

This problem can be solved by taking the square root of the given number and checking if it is an integer. If the square of the integer is equal to the given number, then it is a perfect square. We use the property that the square of an integer is always non-negative, so we can immediately return false if the number is negative.