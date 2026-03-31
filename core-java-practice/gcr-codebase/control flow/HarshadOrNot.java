import java.util.Scanner;

public class HarshadOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        if (n % sum == 0)System.out.println(n + " is a Harshad Number");
        else System.out.println(n+ " is Not a Harshad Number");
        
        
        in.close();
    }
}