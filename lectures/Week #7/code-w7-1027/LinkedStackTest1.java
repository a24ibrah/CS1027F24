import java.util.EmptyStackException;

public class LinkedStackTest1 {
    public static void main(String[] args) {
        // Test Case 1: Basic functionality
        LinkedStack<Integer> stack = new LinkedStack<>();
        System.out.println("Test Case 1: Basic functionality");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Peek (should be 3): " + stack.peek()); // Expected: 3
        System.out.println("Pop (should be 3): " + stack.pop()); // Expected: 3
        System.out.println("Pop (should be 2): " + stack.pop()); // Expected: 2
        System.out.println("Pop (should be 1): " + stack.pop()); // Expected: 1

        // Test Case 2: Edge case - Popping from an empty stack
        System.out.println("\nTest Case 2: Edge case - Popping from an empty stack");
        try {
            stack.pop();
            System.out.println("Error: Should have thrown EmptyStackException");
        } catch (EmptyStackException e) {
            System.out.println("Caught expected EmptyStackException");
        }

        // Test Case 3: Edge case - Peeking on an empty stack
        System.out.println("\nTest Case 3: Edge case - Peeking on an empty stack");
        try {
            stack.peek();
            System.out.println("Error: Should have thrown EmptyStackException");
        } catch (EmptyStackException e) {
            System.out.println("Caught expected EmptyStackException");
        }

        // Test Case 4: Mixed push and pop operations
        System.out.println("\nTest Case 4: Mixed push and pop operations");
        stack.push(10);
        stack.push(20);
        System.out.println("Peek (should be 20): " + stack.peek()); // Expected: 20
        stack.push(30);
        System.out.println("Pop (should be 30): " + stack.pop()); // Expected: 30
        System.out.println("Peek (should be 20): " + stack.peek()); // Expected: 20
        stack.pop();
        stack.pop();
        System.out.println("IsEmpty (should be true): " + stack.isEmpty()); // Expected: true

        // Test Case 5: Edge case - Large number of elements (performance test)
        System.out.println("\nTest Case 5: Performance test with large number of elements");
        int largeCount = 1000000;
        LinkedStack<Integer> largeStack = new LinkedStack<>();
        long startTime = System.currentTimeMillis();
        
        System.out.println("Pushing " + largeCount + " elements...");
        for (int i = 0; i < largeCount; i++) {
            largeStack.push(i);
        }
        
        System.out.println("Popping " + largeCount + " elements...");
        for (int i = 0; i < largeCount; i++) {
            largeStack.pop();
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Performance test completed in " + (endTime - startTime) + " milliseconds");
        System.out.println("Stack is empty after performance test: " + largeStack.isEmpty());

        // Test Case 6: Verify stack size and isEmpty method
        System.out.println("\nTest Case 6: Verify stack size and isEmpty method");
        LinkedStack<String> stringStack = new LinkedStack<>();
        System.out.println("IsEmpty (should be true): " + stringStack.isEmpty()); // Expected: true
        stringStack.push("hello");
        stringStack.push("world");
        System.out.println("Size (should be 2): " + stringStack.size()); // Expected: 2
        stringStack.pop();
        System.out.println("Size (should be 1): " + stringStack.size()); // Expected: 1
        System.out.println("IsEmpty (should be false): " + stringStack.isEmpty()); // Expected: false
    }
}