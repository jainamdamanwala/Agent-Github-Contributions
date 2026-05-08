# Reverse Linked List
# Difficulty: Easy
# URL: https://leetcode.com/problems/reverse-linked-list/

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

def reverseList(self, head: ListNode) -> ListNode:
    
    # Initialize previous and current pointers
    prev = None
    curr = head

    # Traverse the linked list
    while curr:
        
        # Store next node
        next_node = curr.next

        # Reverse link
        curr.next = prev

        # Move previous and current pointers one step forward
        prev = curr
        curr = next_node

    # Return the reversed linked list
    return prev
