// Search Insert Position
// Difficulty: Easy
// URL: https://leetcode.com/problems/search-insert-position/

public int searchInsert(int[] nums, int target) { int[] sorted = Arrays.stream(nums).filter(x -> x <= target).toArray(); return sorted.length == 0 ? 0 : Arrays.binarySearch(sorted, target) + 1; }