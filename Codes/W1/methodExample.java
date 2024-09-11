public class methodExample {
    
    // Method 1: Adds two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds two doubles (Overloaded method)
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Using the add method with integers
        int sum = add(5, 3);

        // Output: Sum of integers: 8
        System.out.println("Sum of integers: " + sum);  

        // Using the overloaded add method with doubles
        double doubleSum = add(2.5, 3.2);

        // Output: Sum of doubles: 5.7
        System.out.println("Sum of doubles: " + doubleSum);  
    }
}


