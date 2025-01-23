/**
 * The finally block is a block of code that will always be executed after a try block,
 * regardless of whether an exception was thrown (occurred) or caught (handled).
 * */
public class FinallyBlock {
    /**
     * Finally blocks are ideal for cleaning up code that performs actions,
     * such as closing open files or database connections,
     * place important information such as status messages, logs,
     * or clean-up tasks within it
     * because there is no possibility that code can be accidentally bypassed.
     * */
      public static void main(String[] args) {
        /*
            Example 1:
                try {
                    // Code that could cause an exception
                } catch(Exception_Type e) {
                    // Code that handles the exception
                } finally {
                    // Code that always executes
                }
            Example 2:
                try {
                    // Code that could cause an exception
                } finally {
                    // Code that always executes
                }

           Though a try block may have multiple catch blocks, there can only be one finally block.
        */

          try {
              int[] array = {10, 20, 30, 40, 50};
              System.out.println(array[5]);
          } catch(ArrayIndexOutOfBoundsException e) {
              System.out.println(e.getMessage());
          } finally {
              System.out.println("In the finally block!");
          }

          containsAnE("Hello");
          containsAnE(null);

          System.out.println("More code");

    }

    /**
     * Another interesting thing about the finally block is that it still gets executed even if the enclosing method returns.
     */
    private static String containsAnE(String word) {
        try {
            return word.contains("E") ? "Contain an E" : "No E found!";
        } catch(NullPointerException e) {
            System.out.println("A NullPointerException occurred!");
            return "Return from catch";
        } finally {
            System.out.println("In the finally block!");
        }
    }

}
