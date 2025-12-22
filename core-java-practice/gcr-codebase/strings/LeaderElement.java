import java.util.*;
public class LeaderElement {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int len=in.nextInt();
	int num[]=new int[len];
	for(int i=0;i<len-1;i++)
	{
		num[i]=in.nextInt();
	}
	for(int i=len-1;i>=0;i--)
	{
		if(num[i-1]>num[i])System.out.print(num[i]);
	}
}
}
