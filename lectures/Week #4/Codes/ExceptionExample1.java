public class ExceptionExample1 {

   public static void main (String[] args) {

      /* 
         - unchecked exceptions: standard runtime exceptions
                                 methods need not state if they throw these
         - generate an array index out of bounds unchecked exception which
           will cause a runtime error
         - another example of an unchecked exception is division by 0
      */

      final int NUM_STUDENTS = 5;

      int students[] = new int[NUM_STUDENTS];

      students[NUM_STUDENTS] = 1;
   }
}