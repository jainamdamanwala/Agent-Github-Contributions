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
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head;
        while (head.next != null) {
            ListNode nextNode = head.next;
            head.next = nextNode.next;
            nextNode.next = newHead;
            newHead = nextNode;
        }
        return newHead;
    }
}