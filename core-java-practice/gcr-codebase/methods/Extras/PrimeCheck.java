import java.util.Scanner;

public class PrimeCheck {
public static void main(String[] args) {
	Scanner in =new Scanner (System.in);
	int num=in.nextInt();
	boolean bool=check(num);
    if(bool)System.out.println("The number is prime");
    else System.out.println("The number is not Prime");
}
public static boolean check(int num)
{
	if(num<=1)return false;
	for(int i=2;i<=Math.sqrt(num);i++)
	{
		if(num%i==0)return false;
	}
	return true;
}
}


