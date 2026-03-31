
public class ReverseString {
       public static void main(String[] args) {
		String str="Abhay is a Good Boy";
		String RevStr="";
		for(int i=str.length()-1;i>=0;i--)RevStr+=str.charAt(i);
		System.out.println("The reverse String is "+RevStr);
	}
}
