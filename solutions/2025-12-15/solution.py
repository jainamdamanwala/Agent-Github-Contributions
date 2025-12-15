# Reverse Linked List
# Difficulty: Easy
# URL: https://leetcode.com/problems/reverse-linked-list/

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseList(self, head: ListNode) -> ListNode:
    
    # Base case: if the list is empty or has only one node
    if not head or not head.next:
        return head

    # Initialize the new head and the previous node
    new_head = None
    prev_node = None

    # Traverse the list
    while head:
        # Store the next node
        next_node = head.next

        # Reverse the link
        head.next = prev_node

        # Move to the next node
        prev_node = head
        head = next_node

    # The new head is the last node we visited
    return prev_node