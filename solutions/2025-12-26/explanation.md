# Search Insert Position

**ID:** 35  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/search-insert-position/  

## Explanation

This problem can be solved using a binary search algorithm. However, since the problem statement asks for the index where the target number should be inserted, we can use a modified binary search approach. We can use the Arrays.binarySearch function in Java to find the index of the target number in the sorted array. If the target number is not present in the array, the binarySearch function will return a negative number. We can use this fact to determine the index where the target number should be inserted. In Python, we can use a list comprehension to filter the array and then use the sorted function to sort the filtered array. The index of the target number in the sorted array will be the index where it should be inserted.