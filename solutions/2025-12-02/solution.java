// Validate IP Address
// Difficulty: Medium
// URL: https://leetcode.com/problems/validate-ip-address/

class Solution {
    public String validIPAddress(String IP) {
        String[] parts;
        if (IP.contains(".")) {
            parts = IP.split(".");
            if (parts.length != 4) {
                return "Neither";
            }
            for (String part : parts) {
                if (part.length() > 1 && part.charAt(0) == '0') {
                    return "Neither";
                }
                if (!part.matches("[0-9]+") || Integer.parseInt(part) > 255 || Integer.parseInt(part) < 0) {
                    return "Neither";
                }
                if (part.length() > 3) {
                    return "Neither";
                }
            }
            return "IPv4";
        } else if (IP.contains(":")) {
            parts = IP.split(":");
            if (parts.length != 8) {
                return "Neither";
            }
            for (String part : parts) {
                if (part.length() > 4) {
                    return "Neither";
                }
                for (char c : part.toCharArray()) {
                    if (!Character.isDigit(c) && !(c >= 'a' && c <= 'f') && !(c >= 'A' && c <= 'F')) {
                        return "Neither";
                    }
                }
            }
            return "IPv6";
        } else {
            return "Neither";
        }
    }
}