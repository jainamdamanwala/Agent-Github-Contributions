# Reverse Linked List
# Difficulty: Easy
# URL: https://leetcode.com/problems/reverse-linked-list/

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

def reverseList(self, head: ListNode) -> ListNode:
    if not head or not head.next:
        return head

    new_head = head
    while head.next:
        next_node = head.next
        head.next = next_node.next
        next_node.next = new_head
        new_head = next_node
    return new_head