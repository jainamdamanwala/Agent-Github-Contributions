# Valid Perfect Square
# Difficulty: Easy
# URL: https://leetcode.com/problems/valid-perfect-square/

def isPerfectSquare(num: int) -> bool:
    if num < 0:
        return False
    sqrt = int(num ** 0.5)
    return sqrt * sqrt == num