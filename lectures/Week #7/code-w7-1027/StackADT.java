// Define the StackADT interface with generic type T
public interface StackADT<T> {
    void push(T element); // Add element to stack
    T pop();              // Remove and return top element
    T peek();             // Return top element without removing
    boolean isEmpty();    // Check if stack is empty
    int size();           // Get the number of elements in the stack
}