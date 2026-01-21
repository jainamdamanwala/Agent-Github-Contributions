// Unique Paths
// Difficulty: Medium
// URL: https://leetcode.com/problems/unique-paths/

public class Solution {
  public int uniquePaths(int m, int n) {
    // Initialize a 2D array with zeros
    int[][] dp = new int[m][n];

    // There is one way to reach any cell in the first row or first column
    for (int i = 0; i < m; i++) {
      dp[i][0] = 1;
    }
    for (int j = 0; j < n; j++) {
      dp[0][j] = 1;
    }

    // Fill in the rest of the 2D array
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        dp[i][j] = dp[i-1][j] + dp[i][j-1];
      }
    }

    // The number of unique paths is stored in the bottom right corner of the 2D array
    return dp[m-1][n-1];
  }
}