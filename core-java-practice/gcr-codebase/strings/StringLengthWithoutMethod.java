import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find string length without length()
    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count); // will throw exception when out of range
                count++;
            }
        } catch (Exception e) {
            
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.next(); 

        int manualLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Length without length() : " + manualLength);
        System.out.println("Length using length()   : " + builtInLength);

      
    }
}
