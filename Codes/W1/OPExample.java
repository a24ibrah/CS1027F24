public class OPExample {
    public static void main(String[] args) {
        int x = 5, y = 10;

        // Arithmetic Operators
        System.out.println("Sum: " + (x + y));
        System.out.println("Difference: " + (y - x));
        System.out.println("Product: " + (x * y));
        System.out.println("Quotient: " + (y / x));
        System.out.println("Remainder: " + (y % x));

        // Relational Operators
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));

        // Logical Operators
        boolean result = (x < y) && (x > 0);
        System.out.println("Result of (x < y) && (x > 0): " + result);

        result = (x > y) || (x == 5);
        System.out.println("Result of (x > y) || (x == 5): " + result);

        result = !(x == y);
        System.out.println("Result of !(x == y): " + result);
    }
}

