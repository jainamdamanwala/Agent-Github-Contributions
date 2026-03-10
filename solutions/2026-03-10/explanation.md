# Unique Paths

**ID:** 62  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/unique-paths/  

## Explanation

This problem can be solved using dynamic programming. We create a 2D array dp where dp[i][j] represents the number of unique paths from the top left corner to the cell at position (i, j). We initialize the first row and first column to 1, because there is only one way to reach each cell in these rows/columns. Then we fill in the rest of the dp array by adding the number of unique paths to the cell above and the cell to the left. The final answer is the value of dp[m-1][n-1], which represents the number of unique paths to the bottom right corner.