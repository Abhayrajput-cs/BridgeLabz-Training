import java.util.Scanner;

public class GenerateSubString {

    static String buildSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
    static boolean isSame(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        String customSub = buildSubstring(text, startIndex, endIndex);
        String builtInSub = text.substring(startIndex, endIndex);
        boolean result = isSame(customSub, builtInSub);
        System.out.println(customSub);
        System.out.println(builtInSub);
        System.out.println(result);

        sc.close();
    }
}
