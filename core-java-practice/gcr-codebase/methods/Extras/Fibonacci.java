import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter the no of terms you want for fibonacci series");
	int n=in.nextInt();
	int arr[]=new int[n];
	arr=fibo(n);
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+ "  ");
	}
}
public static int [] fibo(int n)
{
	int arr[]=new int[n];
	arr[0]=0;
	arr[1]=1;
	for(int i=2;i<n;i++)
	{
		arr[i]=arr[i-1]+arr[i-2];
	}
	return arr;
	
	
}
}
