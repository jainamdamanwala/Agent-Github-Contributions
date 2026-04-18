# Remove Duplicates from Sorted Array

**ID:** 26  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/  

## Explanation

This problem can be solved by using two pointers. The first pointer 'i' is used to track the position of the next unique element, and the second pointer 'j' is used to traverse the array. If the current element is different from the element at position 'i', we increment 'i' and copy the current element to the position 'i'. Finally, we return the value of 'i + 1' which is the length of the array after removing duplicates.