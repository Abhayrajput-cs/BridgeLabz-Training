import java.util.*;
public class ReplaceWord {
       public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=in.nextLine();
		System.out.println("Enter the word to be replaced");
		char ch1=in.next().charAt(0);
		System.out.println("Enter the word to replace with");
		char ch2=in.next().charAt(0);
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch1)s+=str.charAt(i);
			else s+=ch2;
		}
		System.out.println(s);

		}
}
