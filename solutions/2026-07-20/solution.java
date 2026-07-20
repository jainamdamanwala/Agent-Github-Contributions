// Search Insert Position
// Difficulty: Easy
// URL: https://leetcode.com/problems/search-insert-position/

class Solution { public int searchInsert(int[] nums, int target) { int index = Arrays.binarySearch(nums, target); return index >= 0 ? index : ~index; } }