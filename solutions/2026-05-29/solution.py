# Container With Most Water
# Difficulty: Hard
# URL: https://leetcode.com/problems/container-with-most-water/

def maxBoxes(boxes):
  boxes.sort(key=lambda x: x[0])
  max_area = 0
  i, j = 0, len(boxes) - 1
  while i < j:
    if boxes[i][0] + boxes[j][0] > boxes[j][0]:
      max_area = max(max_area, boxes[j][0] * boxes[j][1] * boxes[j][2])
      j -= 1
    else:
      max_area = max(max_area, boxes[i][0] * boxes[i][1] * boxes[i][2])
      i += 1
  return max_area