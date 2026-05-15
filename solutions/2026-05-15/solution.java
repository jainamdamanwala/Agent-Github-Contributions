// Flipping an Image
// Difficulty: Easy
// URL: https://leetcode.com/problems/flipping-an-image/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int left = 0, right = row.length - 1;
            while (left < right) {
                if (row[left] == row[right]) {
                    row[left] = row[right] = row[left] ^ 1;
                    left++;
                    right--;
                } else if (row[left] == 0) {
                    row[left] = 1;
                    left++;
                } else if (row[right] == 0) {
                    row[right] = 1;
                    right--;
                }
            }
            if (left == right) {
                row[left] = row[left] ^ 1;
            }
        }
        return image;
    }
}