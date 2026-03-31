import java.util.Scanner;

public class CharFrequency {
    static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                count++;
        }
        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] output = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("----------------------");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + "\t\t" + output[i][1]);
        }
    
    }
}
