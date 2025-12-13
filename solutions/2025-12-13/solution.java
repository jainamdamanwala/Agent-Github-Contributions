// Median of Two Sorted Arrays
// Difficulty: Hard
// URL: https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tempM = m;
            m = n;
            n = tempM;
        }
        int left = 0, right = m;
        while (left <= right) {
            int i = left + (right - left) / 2;
            int j = (m + n + 1) / 2 - i;
            int maxLeft = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRight = (j == n) ? Integer.MAX_VALUE : nums2[j];
            if (maxLeft < minRight) {
                left = i + 1;
            } else {
                right = i - 1;
            }
        }
        if ((m + n) % 2 == 1) {
            return (double) nums1[left];
        }
        return (maxLeft + minRight) / 2.0;
    }
}