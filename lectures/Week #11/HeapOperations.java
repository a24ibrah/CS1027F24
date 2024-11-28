import java.util.Arrays;

public class HeapOperations<T> {

    // Method to remove the minimum value from the min-heap
    public T removeMin(T[] arr, int n) {
        // The minimum value is always at the root of the min-heap
        T result = arr[0];

        // Replace the root with the last element in the heap
        arr[0] = arr[n - 1];

        // Set the last index to null to indicate the removal
        arr[n - 1] = null;

        // Reduce the size of the heap
        n = n - 1;

        // Restore the heap property using recursive heapify
        heapify(arr, n, 0);

        // Return the removed minimum value
        return result;
    }

    // Recursive method to maintain the heap property
    private void heapify(T[] arr, int n, int i) {
        int left = 2 * i + 1; // Left child index
        int right = 2 * i + 2; // Right child index
        int smallest = i; // Assume the current node is the smallest

        // Compare with left child
        if (left < n && ((Comparable<T>) arr[left]).compareTo(arr[smallest]) < 0) {
            smallest = left;
        }

        // Compare with right child
        if (right < n && ((Comparable<T>) arr[right]).compareTo(arr[smallest]) < 0) {
            smallest = right;
        }

        // If the smallest is not the current node, swap and recurse
        if (smallest != i) {
            T temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, smallest);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example min-heap
        Integer[] heap = {4, 6, 7, 13, 9, 32, 8, 24};
        int size = heap.length;

        // Create an instance of the HeapOperations class
        HeapOperations<Integer> heapOperations = new HeapOperations<>();

        // Print the heap before removal
        System.out.println("Heap before removal: ");
        System.out.println(Arrays.toString(heap));

        // Remove the minimum value
        Integer minValue = heapOperations.removeMin(heap, size);

        // Print the removed minimum value
        System.out.println("Removed minimum value: " + minValue);

        // Print the heap after removal
        System.out.println("Heap after removal: ");
        System.out.println(Arrays.toString(heap));
    }
}
