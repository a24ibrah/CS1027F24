public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if list is empty or has only one node
        }
        
        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;        // Move slow pointer 1 step
            hare = hare.next.next;           // Move fast pointer 2 steps
            
            if (tortoise == hare) {
                return true;  // Cycle detected
            }
        }

        return false;  // No cycle
    }
}
