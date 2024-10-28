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
            throw new IllegalStateException("Stack is full"); // {{ edit_1 }}
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // {{ edit_2 }}
        }
        return stack[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // {{ edit_3 }}
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
        // Append the elements of the stack to the result
        for (int i = 0; i <= top; i++) {
            result.append(stack[i]);
            if (i < top) result.append(" "); // {{ edit_4 }} to avoid trailing space
        }
        return result.toString();
    }
}