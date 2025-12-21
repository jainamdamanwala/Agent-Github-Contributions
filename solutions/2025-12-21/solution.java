// Longest Consecutive Sequence
// Difficulty: Medium
// URL: https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max_length = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current_num = num;
                int current_length = 1;
                while (set.contains(current_num + 1)) {
                    current_num += 1;
                    current_length += 1;
                }
                max_length = Math.max(max_length, current_length);
            }
        }
        return max_length;
    }
}