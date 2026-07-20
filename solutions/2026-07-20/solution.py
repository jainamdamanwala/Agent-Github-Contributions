# Search Insert Position
# Difficulty: Easy
# URL: https://leetcode.com/problems/search-insert-position/

def searchInsert(nums, target): return nums.index(target) if target in nums else len(nums) + nums.bisect_left(target) - 1