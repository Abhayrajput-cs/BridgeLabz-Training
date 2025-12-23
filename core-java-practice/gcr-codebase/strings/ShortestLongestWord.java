import java.util.Scanner;

public class ShortestLongestWord {

    // Find length without length()
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Split text into words without split()
    static String[] splitWords(String text) {
        int len = findLength(text);
        int words = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] arr = new String[words];
        int index = 0;
        arr[index] = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                index++;
                arr[index] = "";
            } else {
                arr[index] += text.charAt(i);
            }
        }
        return arr;
    }

    // Convert words into 2D array (word + length)
    static String[][] wordLength2D(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    // Find shortest & longest
    static int[] shortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordLength2D(words);
        int[] result = shortestLongest(table);

        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);

    }
}
