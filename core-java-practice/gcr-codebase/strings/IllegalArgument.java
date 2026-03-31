import java.util.*;
public class IllegalArgument {
    // Method 1: Generate Runtime Exception (no handling)
    static void generateException(String str) {
        System.out.println(str.substring(5, 2));
    }

     static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // First call: This will crash the program
      //generateException(input);
        // Second call: Exception is handled
        handleException(input);
   } 
}
