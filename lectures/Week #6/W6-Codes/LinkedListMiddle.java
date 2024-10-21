public class LinkedListMiddle {
    public ListNode findMiddle(ListNode head) {
        if (head == null) return null;  // If list is empty
        
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer by one
            fast = fast.next.next;   // Move fast pointer by two
        }

        return slow;  // Slow pointer is now at the middle node
    }
}
