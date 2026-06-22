// Valid Palindrome
// Difficulty: Easy
// URL: https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean validPalindrome(String s) {
        return isPalindrome(s) || (isPalindrome(s.substring(0, s.length() - 1)) && isPalindrome(s.substring(1)));
    }
    public boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}