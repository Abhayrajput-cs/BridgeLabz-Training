import java.util.*;
public class CountVowelConsonant {
   public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	int l = str.length();
	str.toLowerCase();
	HashSet<Character>setV = new HashSet<>();
	HashSet<Character>setC = new HashSet<>();
	for(int i=0;i<l;i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u')setV.add(str.charAt(i));
		else setC.add(str.charAt(i));
	}
	System.out.println("There are "+setV.size()+" Vowels and "+setC.size()+" consonants in the given String");
	in.close();
}
}
