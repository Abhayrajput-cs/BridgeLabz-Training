import java.util.Scanner;

public class MaxOf3 {
	public static int maxx(int num1,int num2)
	{
		if(num1>num2)return num1;
		return num2;
	}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the three numbers");
	int num1=in.nextInt();
	int num2=in.nextInt();
	int num3=in.nextInt();
	int max1=maxx(num1,num2);
	  int max2=maxx(max1,num3);
	  System.out.println("The greatest is "+max2);
	  
	
}
}
