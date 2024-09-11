import java.util.Scanner;

public class controlFlowExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Shortened if-else example
        System.out.print("Enter your score: ");
        int score = input.nextInt();
        System.out.println(score > 90 ? "Grade: A" : score > 80 ? "Grade: B" : "Grade: C");

        // Shortened switch example
        System.out.print("Enter a number for the day (1-7): ");
        switch(input.nextInt()) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day");
        }

        input.close();
    }
}


