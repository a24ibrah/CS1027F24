// Testing class
public class StackExample {
    public static void main(String[] args) {
        StackADT<Integer> stack = new ArrayStack<>(5); // valid
        try {
            stack.push(10);
            stack.push(20);
            System.out.println("Top element: " + stack.peek()); // Output: 20
            System.out.println("Stack size: " + stack.size());  // Output: 2
            System.out.println(stack.toString());  // Output: Stack: 10 20 

            stack.pop();
            System.out.println("Top element: " + stack.peek()); // Output: 10
            System.out.println("Stack size: " + stack.size());  // Output: 1
            System.out.println(stack.toString());  // Output: Stack: 10

            // Attempt to pop all elements
            stack.pop();
            System.out.println("Top element after pop: " + stack.peek()); // This will throw an exception
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage()); // Handle stack underflow or overflow
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage()); // Handle unexpected array access
        }
    }
}