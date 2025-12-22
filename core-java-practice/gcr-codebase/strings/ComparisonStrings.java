import java.util.Scanner;

public class ComparisonStrings {
    static String makeLower(String data) {
        String output = "";
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (c >= 65 && c <= 90) {
                c = (char) (c + 32);
            }
            output = output + c;
        }
        return output;
    }

    static boolean checkEqual(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String manualLower = makeLower(text);
        String systemLower = text.toLowerCase();

        boolean result = checkEqual(manualLower, systemLower);

        System.out.println(manualLower);
        System.out.println(systemLower);
        System.out.println(result);

        input.close();
    }
}
