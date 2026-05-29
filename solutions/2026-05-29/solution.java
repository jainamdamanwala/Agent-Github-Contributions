// Container With Most Water
// Difficulty: Hard
// URL: https://leetcode.com/problems/container-with-most-water/

public int maxBoxes(int[][] boxes) {
  Arrays.sort(boxes, (a, b) -> a[0] - b[0]);
  int maxArea = 0;
  int i = 0, j = boxes.length - 1;
  while (i < j) {
    if (boxes[i][0] + boxes[j][0] > boxes[j][0]) {
      maxArea = Math.max(maxArea, boxes[j][0] * boxes[j][1] * boxes[j][2]);
      j--;
    } else {
      maxArea = Math.max(maxArea, boxes[i][0] * boxes[i][1] * boxes[i][2]);
      i++;
    }
  }
  return maxArea;
}