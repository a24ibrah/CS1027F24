
// Testing class
public class StackExample {
    public static void main(String[] args) {
        StackADT<Integer> stack = new ArrayStack<>(5); // valid
        stack.push(10);
        stack.push(20);
        System.out.println("Top element: " + stack.peek()); // Output: 20
        System.out.println("Stack size: " + stack.size());  // Output: 2
        System.out.println(stack.toString());  // Output: Stack: 10 20 

        stack.pop();
        System.out.println("Top element: " + stack.peek()); // Output: 10
        System.out.println("Stack size: " + stack.size());  // Output: 1
        System.out.println(stack.toString());  // Output: Stack: 10

    }
}
