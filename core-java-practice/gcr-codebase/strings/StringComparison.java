import java.util.*;

public class StringComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if (s1.length() > s2.length()) {
            System.out.println("String " + s2 + " comes before " + s1);
            return;
        } else if (s2.length() > s1.length()) {
            System.out.println("String " + s1 + " comes before " + s2);
            return;
        }
        int asciiCount = 0;
        int asciiCount2 = 0;
        for (int i = 0; i < s1.length(); i++)asciiCount += (int) s1.charAt(i);
        for (int i = 0; i < s2.length(); i++)asciiCount2 += (int) s2.charAt(i);
        if (asciiCount > asciiCount2)System.out.println("String " + s1 + " comes before " + s2);
        else System.out.println("String " + s2 + " comes before " + s1);
    }
}
