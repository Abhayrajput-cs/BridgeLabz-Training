import java.util.Scanner;

public class NumberFormatExceptions {

    static String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static void createException(String value) {
        int number = Integer.parseInt(value);
        System.out.println(number);
    }

    static void handleException(String value) {
        try {
            int number = Integer.parseInt(value);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } 
    }

    public static void main(String[] args) {

        String text = getInput();

        try {
            createException(text);
        } catch (Exception e) {
            System.out.println("Program stopped due to exception");
        }

        handleException(text);
    }
}
