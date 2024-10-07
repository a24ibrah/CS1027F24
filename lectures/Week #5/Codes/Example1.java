import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            int defaultRate = 5;  // Default value for recovery
            System.out.println("Enter new value:");
            int value = reader.nextInt();
            int result = 0;  // Initialize result outside the try block

            try {
                result = foo(value);
                System.out.println("Result = " + result);
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Error: Division by zero.");
                result = foo(defaultRate);  // Call the function with a default rate
            } catch (IllegalArgumentException e) {
                // Handle invalid input (negative rate)
                System.out.println("Error: Invalid input. Rate cannot be negative.");
                result = foo(defaultRate);  // Call the function with a default rate
            } catch (Exception e) {
                // Handle any other general exceptions
                System.out.println("Error: " + e.getMessage());
                result = foo(defaultRate);  // Call the function with a default rate
            }

            // Display the final result after handling exceptions
            System.out.println("Final result = " + result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // The foo method throws various exceptions based on the input rate
    public static int foo(int rate) throws ArithmeticException, IllegalArgumentException, Exception {
        if (rate == 0) {
            // Throw ArithmeticException for division by zero
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        if (rate < 0) {
            // Throw IllegalArgumentException for negative input
            throw new IllegalArgumentException("Rate cannot be negative.");
        }

        // Simulate a potential unexpected issue (optional)
        if (rate > 1000) {
            // Throw a general exception for an unusual condition
            throw new Exception("Rate is too high to process.");
        }

        // Normal calculation (assume rate is valid and non-zero)
        int value = 100 / rate;

        return value;
    }
}
