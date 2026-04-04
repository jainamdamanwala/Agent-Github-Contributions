// Contains Duplicate
// Difficulty: Easy
// URL: https://leetcode.com/problems/contains-duplicate/

public boolean containsDuplicate(int[] nums) { return nums.length != new HashSet<Integer>(Arrays.asList(nums)).size(); }