import java.util.Scanner;

public class UpperCaseCompare {

    // Method to convert string to uppercase using ASCII logic
    static String manualToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // ASCII conversion
            }

            result = result + ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Convert  built-in method
        String builtInUpper = input.toUpperCase();
        //  using user-defined method
        String manualUpper = manualToUpper(input);

        // Compare both strings
        boolean result = compareStrings(builtInUpper, manualUpper);

        System.out.println("Built-in Uppercase : " + builtInUpper);
        System.out.println("Manual Uppercase   : " + manualUpper);
        System.out.println("Are both results same? " + result);
    }
}
