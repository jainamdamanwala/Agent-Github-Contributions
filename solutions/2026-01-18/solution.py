# Reverse Linked List
# Difficulty: Easy
# URL: https://leetcode.com/problems/reverse-linked-list/

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseList(self, head: ListNode) -> ListNode:
    
    # Initialize three pointers: prev, curr, and next
    prev = None
    curr = head
    
    # Traverse the linked list
    while curr:
        # Store the next node
        next_node = curr.next
        
        # Reverse the link
        curr.next = prev
        
        # Move the pointers one step forward
        prev = curr
        curr = next_node
    
    # Return the new head
    return prev
