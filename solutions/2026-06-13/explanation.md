# Remove Duplicates from Sorted Array II

**ID:** 80  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/  

## Explanation

This problem is a variation of the "Remove Duplicates from Sorted Array" problem. The main difference is that we are allowed to have at most two duplicates. We use two pointers, i and j, where i is the index of the last unique element and j is the index of the current element. If the current element is different from the last unique element, we move i and copy the current element to the position of i. Finally, we return i which is the index of the last unique element plus one.