# Flipping an Image
# Difficulty: Easy
# URL: https://leetcode.com/problems/flipping-an-image/

class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        return [[1 - pixel for pixel in row[::-1]] for row in image]