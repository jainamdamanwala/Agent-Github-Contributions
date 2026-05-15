# Flipping an Image

**ID:** 832  
**Difficulty:** Easy  
**URL:** https://leetcode.com/problems/flipping-an-image/  

## Explanation

The problem can be solved by iterating over each row in the image and flipping the row. We use two pointers, one at the start and one at the end of the row. If the pixels at the two pointers are the same, we flip them and move both pointers. If the pixel at the left pointer is 0, we flip it and move the left pointer. If the pixel at the right pointer is 0, we flip it and move the right pointer. If the two pointers meet, we flip the pixel at the meeting point. Finally, we return the modified image.