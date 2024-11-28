
# Building a Min-Heap: Java Implementation

## **The Problem**
You are given an **array of numbers**, and the task is to transform it into a **min-heap**. A **min-heap** is a binary tree structure where every parent node is smaller than or equal to its children. 

In this implementation, we use the **bottom-up approach**, which:
1. Starts from the last non-leaf node and moves upward to the root.
2. Fixes the heap property at each node using the recursive **heapify** method.

---

## **Logical Steps in the Program**

### **1. Identify the Start Point**
- A non-leaf node is a node with at least one child.
- The last non-leaf node in the array representation of a heap is at index:
  \[
  	ext{Last Non-Leaf Node} = \lfloor n/2 floor - 1
  \]

### **2. Fix the Heap Property Bottom-Up**
- Starting from the last non-leaf node:
  - Use the **heapify** method to ensure the subtree rooted at that node satisfies the min-heap property.
- Repeat this for all nodes up to the root (index 0).

### **3. Result**
- After heapifying all nodes, the array is transformed into a valid **min-heap**.

---

## **Step-by-Step Code Breakdown**

### **1. The `buildMinHeap` Method**
- **Purpose**: Transforms the given array into a min-heap.
- **How It Works**:
  - Loops from the last non-leaf node to the root.
  - Calls `heapify` for each node to ensure the subtree rooted at that node satisfies the min-heap property.

---

### **2. The `heapify` Method**
- **Purpose**: Ensures the subtree rooted at a given node satisfies the min-heap property.
- **How It Works**:
  - Compares the current node with its left and right children.
  - Swaps the current node with the smallest child if the heap property is violated.
  - Recursively fixes the affected subtree.

---

### **3. The `main` Method**
- **Purpose**: Demonstrates how to use `buildMinHeap` and prints the results.
- **How It Works**:
  - Defines an example array.
  - Prints the array before and after converting it into a min-heap.

---

## **Execution Story**

### **1. Start with the Input**
- Given an array:
  ```java
  {24, 13, 32, 6, 9, 17, 8, 4, 15}
  ```

### **2. Identify the Last Non-Leaf Node**
- For an array of size \( n = 9 \):
  ```java
  Last Non-Leaf Node = (9 / 2) - 1 = 3
  ```
- Nodes to heapify are at indices: \( 3, 2, 1, 0 \).

### **3. Heapify Bottom-Up**
- Start at index 3 (value 6):
  - Compare 6 with its children (4 and 15).
  - Swap 6 with 4:
    ```java
    {24, 13, 32, 4, 9, 17, 8, 6, 15}
    ```

- Move to index 2 (value 32):
  - Compare 32 with its children (17 and 8).
  - Swap 32 with 8:
    ```java
    {24, 13, 8, 4, 9, 17, 32, 6, 15}
    ```

- Continue with indices 1 and 0, recursively fixing each subtree.

### **4. Output the Result**
- The final min-heap is:
  ```java
  {4, 6, 8, 13, 9, 17, 32, 24, 15}
  ```

---

## **How to Run the Code**

### **1. Set Up the Environment**
- Copy the code into a file named `MinHeapBuilder.java`.
- Compile and run the program:
  ```bash
  javac MinHeapBuilder.java
  java MinHeapBuilder
  ```

### **2. Modify the Input**
- Replace the example array in the `main` method with any other array and re-run the program to see the results.

### **3. Observe the Output**
- The program will print:
  - The original array.
  - The array after converting it into a min-heap.

---

## **Key Learning Objectives**
- Understand how **arrays** are used to represent heaps.
- Learn how to build a min-heap using the **bottom-up approach**.
- Explore **recursion** in the context of the heapify process.
- Practice rearranging data to satisfy constraints (heap property).

---

## **Why This Works**
- Starting from the last non-leaf node ensures that smaller subtrees are fixed before larger ones, making the process efficient.
- The recursive nature of `heapify` simplifies the logic for rearranging elements.

---

## **Sample Output**

For the input:
```java
{24, 13, 32, 6, 9, 17, 8, 4, 15}
```

The program will output:
```plaintext
Original Array:
[24, 13, 32, 6, 9, 17, 8, 4, 15]

Min-Heap:
[4, 6, 8, 13, 9, 17, 32, 24, 15]
```
