import java.util.*;
public class CompareStringsCharAt {
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean manualResult = compareStrings(str1, str2);

        
        boolean builtin = str1.equals(str2);

        System.out.println("Manual Comparison result: " + manualResult);
        System.out.println("Built-in equals() result: " + builtin);
        System.out.println("Both results are same: " + (manualResult == builtin));
    }
     
    
}