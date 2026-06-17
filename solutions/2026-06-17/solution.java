// Reverse Linked List
// Difficulty: Easy
// URL: https://leetcode.com/problems/reverse-linked-list/

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head;
        while (head != null && head.next != null) {
            ListNode nextNode = head.next;
            head.next = nextNode.next;
            nextNode.next = newHead;
            newHead = nextNode;
            head = head.next;
        }
        return newHead;
    }
}