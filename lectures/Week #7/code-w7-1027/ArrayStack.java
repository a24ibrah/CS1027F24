
// Class that implements the StackADT interface
public class ArrayStack<T> implements StackADT<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    @Override
    public void push(T element) {
        if (top < capacity - 1) {
            stack[++top] = element;
        } else {
            System.out.println("Stack is full");
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
    StringBuilder result = new StringBuilder("Stack: ");
    // StringBuilder is a class in Java that is used to create mutable sequences of characters.
    // It provides a convenient way to create and manipulate strings in Java.

    // Append the elements of the stack to the result
    for (int i = 0; i <= top; i++) {
        result.append(stack[i]).append(" ");
    }
    return result.toString();
}

}