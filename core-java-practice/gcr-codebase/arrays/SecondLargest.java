import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        System.out.print("Enter a number");
        int number = sc.nextInt();

        int index = 0;

        while (number > 0 && index < maxDigit) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = digits[0];
        int secondLargest = -1;

        for (int i = 1; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] != largest && digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }

  
        System.out.println("Largest " + largest);
        System.out.println("Second largest:" + secondLargest);

        sc.close();
    }
}
