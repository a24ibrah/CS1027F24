import java.util.Scanner;

public class ioJava
 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the entered number
        int num = input.nextInt();
        
        // Display the entered number
        System.out.println("You entered: " + num);
        
        // Close the scanner to prevent resource leaks
        input.close();
    }
}


