# Search Insert Position
# Difficulty: Easy
# URL: https://leetcode.com/problems/search-insert-position/

def searchInsert(nums, target): return sorted([x for x in nums if x <= target])[-1]