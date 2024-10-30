import java.util.EmptyStackException;

public class LinkedStack<T> {
    // Node class defined inside LinkedStack for simplicity
    private class Node {
        T data;
        Node next;
        
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node top;    // Reference to the top of stack
    private int size;    // Number of elements in stack
    
    // Constructor
    public LinkedStack() {
        top = null;
        size = 0;
    }
    
    // Add element to top of stack
    public void push(T item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    // Remove and return top element
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }
    
    // Look at top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
    
    // Get number of elements in stack
    public int size() {
        return size;
    }
}