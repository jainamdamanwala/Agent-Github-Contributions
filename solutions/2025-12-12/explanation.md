# Container With Most Water

**ID:** 11  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

The algorithm starts from the two ends of the array and moves the pointer of the shorter line towards the other end. This is because the area of water is determined by the height of the shorter line, so moving the pointer of the shorter line will not decrease the area. The time complexity is O(n), where n is the number of lines.