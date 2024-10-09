public class ExceptionExample7 {

   private static boolean debug = true;
   private static final int NUM_STUDENTS = 5;
   private static final int ILLEGAL_INDEX = 5;

   /*  - try/catch at the method invocation level
   */

   public static void change(int[] course) {

      if (debug) System.out.println("in method change ");

      course[ILLEGAL_INDEX] = 10;
      
      
      if (debug) System.out.println("end of method change");
   }

   public static void main (String[] args) {

      int students[] = new int[NUM_STUDENTS];

      try {
         change(students);
      }

      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Sorry, index " + ILLEGAL_INDEX + " does not exist.");
      }

      if (debug) System.out.println("end of main");
   }
}