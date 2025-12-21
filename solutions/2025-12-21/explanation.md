# Longest Consecutive Sequence

**ID:** 128  
**Difficulty:** Medium  
**URL:** https://leetcode.com/problems/longest-consecutive-sequence/  

## Explanation

This problem can be solved by using a HashSet to store the given array. Then, we iterate over the HashSet. For each number, we check if it's the start of a sequence (i.e., `num - 1` is not in the set). If it is, we then check the length of the sequence by continuously checking if `num + 1` is in the set. We keep track of the maximum length of the sequence found so far.