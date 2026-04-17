# Container With Most Water

**ID:** 11  
**Difficulty:** Hard  
**URL:** https://leetcode.com/problems/container-with-most-water/  

## Explanation

This problem is about finding two indices in an array of integers such that the area of the rectangle formed by these two indices and the height of the rectangle is maximum. The height of the rectangle is given by the minimum height of the two indices. The area of the rectangle is given by the product of the width and the height. We start from both ends of the array and move towards the center. At each step, we calculate the area of the rectangle formed by the current two indices and update the maximum area if necessary. We move the index with the smaller height towards the center because the area of the rectangle is determined by the minimum height.