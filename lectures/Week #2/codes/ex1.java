public class ex1 {
    
    // Function similar to foo() in C
    public static int foo() {
        return 1;
    }

    public static void main(String[] args) {
        int a = 1;
        
        // Calculation and printing the result
        int c = a + foo() + 10;
        System.out.println(c);
    }
}
