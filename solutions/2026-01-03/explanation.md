# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The problem can be solved by using a two-pointer approach. We start from both ends of the array and move the pointer of the shorter line towards the other end. The area of water is calculated as the minimum height of the two lines multiplied by the distance between them. We keep track of the maximum area found so far and update it whenever we find a larger area.