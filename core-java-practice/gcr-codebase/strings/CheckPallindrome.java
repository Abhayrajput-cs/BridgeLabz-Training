import java.util.*;
public class CheckPallindrome {
    // LOGIC 1: Using start and end index (loop)
    static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
     // LOGIC 2: Using recursion
    static boolean isPalindromeLogic2(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeLogic2(text, start + 1, end - 1);
    }
   // Method to reverse string using charAt()
    static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    // LOGIC 3: Using character arrays
    static boolean isPalindromeLogic3(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Loop): " + isPalindromeLogic1(text));
        System.out.println("Logic 2 (Recursion): " + isPalindromeLogic2(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Char Array): " + isPalindromeLogic3(text));
     }
}
