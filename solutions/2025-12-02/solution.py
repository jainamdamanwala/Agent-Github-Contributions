# Validate IP Address
# Difficulty: Medium
# URL: https://leetcode.com/problems/validate-ip-address/

class Solution:
    def validIPAddress(self, IP: str) -> str:
        parts = IP.split('.')
        if len(parts) != 4:
            return "Neither"
        for part in parts:
            if len(part) > 1 and part[0] == "0":
                return "Neither"
            if not part.isdigit() or not 0 <= int(part) <= 255:
                return "Neither"
            if len(part) > 3:
                return "Neither"
        return "IPv4"
    def validIPv6(self, IP: str) -> str:
        parts = IP.split(':')
        if len(parts) != 8:
            return "Neither"
        for part in parts:
            if len(part) > 4:
                return "Neither"
            for char in part:
                if not char.isdigit() and not (char.lower() >= 'a' and char.lower() <= 'f'):
                    return "Neither"
        return "IPv6"