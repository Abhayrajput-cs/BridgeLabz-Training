import java.util.Scanner;

public class WordsWithLength2D {

    // Method to find string length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Method to split text into words without using split()
    static String[] splitWords(String text) {

        int len = findLength(text);
        int wordCount = 1;

        // Count number of words
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        words[wordIndex] = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordIndex++;
                words[wordIndex] = "";
            } else {
                words[wordIndex] += text.charAt(i);
            }
        }

        return words;
    }

    // Method to convert word array into 2D array (word + length)
    static String[][] wordLength2D(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; 
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengthTable = wordLength2D(words);

        System.out.println("\nWord\tLength");
        System.out.println("---------------");

        for(int i = 0; i < wordLengthTable.length; i++) {
            int len = Integer.parseInt(wordLengthTable[i][1]);
            System.out.println(wordLengthTable[i][0] + "\t" + len);
        }

    }
}
