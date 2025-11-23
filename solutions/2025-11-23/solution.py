# Reverse Linked List
# Difficulty: Easy
# URL: https://leetcode.com/problems/reverse-linked-list/

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseList(self, head: ListNode) -> ListNode:
    
    prev = None
    while head:
        next_node = head.next
        head.next = prev
        prev = head
        head = next_node
    return prev

# Example usage:
# Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
# head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
# reversed_head = reverseList(head)
# While reversed_head:
#     print(reversed_head.val)
#     reversed_head = reversed_head.next