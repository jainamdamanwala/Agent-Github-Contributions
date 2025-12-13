# Median of Two Sorted Arrays
# Difficulty: Hard
# URL: https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m, n = len(nums1), len(nums2)
        if m > n:
            nums1, nums2, m, n = nums2, nums1, n, m
        left, right = 0, m
        while left <= right:
            i = (left + right) // 2
            j = (m + n + 1) // 2 - i
            max_left = float('-inf') if i == 0 else nums1[i - 1]
            min_right = float('inf') if j == n else nums2[j]
            if max_left < min_right:
                left = i + 1
            else:
                right = i - 1
        if (m + n) % 2 == 1:
            return float(max_left)
        return (max_left + min_right) / 2