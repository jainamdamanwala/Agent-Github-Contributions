# Unique Paths

**ID:** 62  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/unique-paths/  

## Explanation

This problem can be solved using dynamic programming. We create a 2D array dp where dp[i][j] represents the number of unique paths to reach cell (i, j). We initialize the first row and first column of the 2D array to 1, since there is one way to reach any cell in the first row or first column. Then, we fill in the rest of the 2D array by adding the number of unique paths to reach the cell above and the cell to the left. The number of unique paths to reach the bottom right corner of the grid is stored in the bottom right corner of the 2D array.