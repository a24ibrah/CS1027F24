import java.io.*;

public class ExceptionExample14 {

   public static void main (String[] args) throws Exception {

      /* 
         - multiple exceptions
         - the first exception that applies will be selected
         - this won't compile
      */

      BufferedReader keyboard=
         new BufferedReader (new InputStreamReader(System.in),1);

      System.out.print("Enter an integer: ");
      String userTyped = keyboard.readLine();

      try {
         int value = Integer.parseInt(userTyped);
         System.out.println("Divide by zero " + 5/0);
      }
      catch (Exception e) {
         System.out.println("Hey, that's not an integer!");
      }
      catch (ArithmeticException e) {
         System.out.println("I don't know how to divide by 0.");
      }

      System.out.println("end of main"); 
  }
}