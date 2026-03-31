import java.util.*;
public class LowerCaseCompare {
    static String manualToLower(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // ASCII conversion
            }

            result = result + ch;
        }
        return result;
    }
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

        // Convert using built-in method
        String builtInLower = input.toLowerCase();

        // Convert using user-defined method
        String manualLower = manualToLower(input);

        // Compare both results
        boolean result = compareStrings(builtInLower, manualLower);

       System.out.println("Built-in Lowercase : " + builtInLower);
        System.out.println("Manual Lowercase   : " + manualLower);
        System.out.println("Are both result same? " + result);
        
    }
}
