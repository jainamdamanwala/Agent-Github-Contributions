// Reverse Linked List
// Difficulty: Easy
// URL: https://leetcode.com/problems/reverse-linked-list/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next_node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_node;
        }

        return prev;
    }
}