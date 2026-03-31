import java.util.Scanner;

public class TrimUsingCharAt {

    // Method to find start and end index without spaces
    static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = 0;

        // Find start
        for (int i = 0; ; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        // Find end
        for (int i = 0; ; i++) {
            try {
                text.charAt(i);
                end = i;
            } catch (Exception e) {
                break;
            }
        }

        while (text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        int i = 0;
        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i))
                    return false;
                i++;
            }
        } catch (Exception e) {
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] index = findTrimIndexes(text);
        String manualTrim = manualSubstring(text, index[0], index[1]);
        String builtInTrim = text.trim();

        boolean result = compareStrings(manualTrim, builtInTrim);

        System.out.println("Manual Trim Result: [" + manualTrim + "]");
        System.out.println("Built-in Trim Result: [" + builtInTrim + "]");
        System.out.println("Both results are same? " + result);
    }
}
