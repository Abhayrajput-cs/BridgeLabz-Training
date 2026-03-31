import java.util.Scanner;

public class StringIndexOutOfBounds {
    // generatr
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); 
        // cause StringIndexOutOfBoundsException
    }

    // Method to handle the Exception using try-catch
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled successfully!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(str);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n--- Handling Exception ---");
        handleException(str);
    }
}

