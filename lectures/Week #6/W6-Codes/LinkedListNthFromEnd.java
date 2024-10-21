public class LinkedListNthFromEnd {
    public ListNode findNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) return null; // Handle empty list or invalid input
        
        ListNode fast = head;
        ListNode slow = head;
        
        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null; // If n is larger than the length of the list
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Slow pointer is now at the nth node from the end
        return slow;
    }
}
