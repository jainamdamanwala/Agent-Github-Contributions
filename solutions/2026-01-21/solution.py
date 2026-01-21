# Unique Paths
# Difficulty: Medium
# URL: https://leetcode.com/problems/unique-paths/

def uniquePaths(m: int, n: int) -> int:
  # Initialize a 2D array with zeros
  dp = [[0]*n for _ in range(m)]

  # There is one way to reach any cell in the first row or first column
  for i in range(m):
    dp[i][0] = 1
  for j in range(n):
    dp[0][j] = 1

  # Fill in the rest of the 2D array
  for i in range(1, m):
    for j in range(1, n):
      dp[i][j] = dp[i-1][j] + dp[i][j-1]

  # The number of unique paths is stored in the bottom right corner of the 2D array
  return dp[m-1][n-1]