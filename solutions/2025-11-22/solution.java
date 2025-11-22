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
        int imin = 0, imax = m, half_len = (m + n + 1) / 2;
        while (imin <= imax) {
            int i = imin + (imax - imin) / 2;
            int j = half_len - i;
            if (i < m && nums2[j-1] > nums1[i]) {
                imin = i + 1;
            } else if (i > 0 && nums1[i-1] > nums2[j]) {
                imax = i - 1;
            } else {
                if (i == 0) maxOfLeft = nums2[j-1];
                else if (j == 0) maxOfLeft = nums1[i-1];
                else maxOfLeft = Math.max(nums1[i-1], nums2[j-1]);
                if ((m + n) % 2 == 1) {
                    return (double) maxOfLeft;
                }
                if (i == m) minOfRight = nums2[j];
                else if (j == n) minOfRight = nums1[i];
                else minOfRight = Math.min(nums1[i], nums2[j]);
                return (maxOfLeft + minOfRight) / 2.0;
            }
        }
        return 0;
    }
}