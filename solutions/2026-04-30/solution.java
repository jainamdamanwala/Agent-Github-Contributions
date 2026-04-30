// Container With Most Water
// Difficulty: Hard
// URL: https://leetcode.com/problems/container-with-most-water/

public int maxSubarrays(int[] nums) {
  int n = nums.length;
  int maxCount = 0;
  int left = 0;
  int currSum = 0;
  for (int right = 0; right < n; right++) {
    currSum += nums[right];
    while (currSum < 0 && left <= right) {
      currSum -= nums[left];
      left++;
    }
    maxCount = Math.max(maxCount, right - left + 1);
  }
  return maxCount;
}