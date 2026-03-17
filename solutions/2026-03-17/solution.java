// Longest Common Prefix
// Difficulty: Easy
// URL: https://leetcode.com/problems/longest-common-prefix/

public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String shortest = strs[0];
    for (String str : strs) {
        if (str.length() < shortest.length()) shortest = str;
    }
    for (int i = 0; i < shortest.length(); i++) {
        for (String str : strs) {
            if (str.charAt(i) != shortest.charAt(i)) return shortest.substring(0, i);
        }
    }
    return shortest;
}