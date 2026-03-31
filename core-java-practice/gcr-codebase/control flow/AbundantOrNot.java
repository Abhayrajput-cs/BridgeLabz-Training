import java.util.Scanner;

public class AbundantOrNot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum > number)System.out.println(number + " is an Abundant Number.");
        else System.out.println(number + " is Not an Abundant Number.");
        
    }
}