# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem is actually asking for the maximum area of water that can be trapped between two lines, where the height of the lines is given by the input array. The two lines are formed by the two points (a, b) and (c, d) such that a < c, b < d and c - a >= max(d - b, d - b). This is equivalent to finding the maximum area of water that can be trapped between two lines, which is a classic problem in computer science. The solution is to use a two-pointer technique, where we start with two pointers at the beginning and end of the array and move them towards each other. At each step, we calculate the area of water that can be trapped between the two lines and update the maximum area if necessary. We move the pointer that points to the shorter line towards the other pointer, because the area of water that can be trapped is limited by the shorter line.