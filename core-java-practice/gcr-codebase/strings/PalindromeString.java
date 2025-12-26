import java.util.*;
public class PalindromeString {
     public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		String RevStr="";
		for(int i=str.length()-1;i>=0;i--)RevStr+=str.charAt(i);
		if(str.equals(RevStr))System.out.println("The Strings Are Palindrome");
		else {
			System.out.println("The Strings Are not Palindrome");
		}
	}
}
