import java.util.Arrays;

public class MinHeapBuilder {

    // Method to build a min-heap from a given array
    public static void buildMinHeap(int[] arr) {
        int n = arr.length;

        // Start heapifying from the last non-leaf node down to the root
        // The last non-leaf node is at index (n / 2) - 1
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Recursive method to restore the min-heap property
    private static void heapify(int[] arr, int n, int i) {
        int smallest = i; // Initialize the smallest as the current node
        int left = 2 * i + 1; // Index of the left child
        int right = 2 * i + 2; // Index of the right child

        // Check if the left child is smaller than the current node
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        // Check if the right child is smaller than the smallest so far
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        // If the smallest is not the current node, swap and continue heapifying
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, smallest);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example array
        int[] arr = {24, 13, 32, 6, 9, 17, 8, 4, 15};

        // Print the original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // Build a min-heap
        buildMinHeap(arr);

        // Print the min-heap
        System.out.println("Min-Heap:");
        System.out.println(Arrays.toString(arr));
    }
}
