import java.util.Scanner;

public class CalciSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = in.nextDouble();
        System.out.print("Enter second number: ");
        double second = in.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = in.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0)System.out.println("Result: " + (first / second));
                else System.out.println("Division by zero is not allowed");
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}