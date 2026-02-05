// Contains Duplicate
// Difficulty: Easy
// URL: https://leetcode.com/problems/contains-duplicate/

class Solution { public boolean containsDuplicate(int[] nums) { return new HashSet<Integer>(Arrays.asList(nums)).size() != nums.length; } }