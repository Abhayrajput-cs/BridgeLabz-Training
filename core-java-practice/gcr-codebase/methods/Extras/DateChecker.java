import java.time.LocalDate;
import java.util.Scanner;

public class DateChecker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate first = LocalDate.parse(in.next());
        System.out.print("Enter second date");
        LocalDate sec = LocalDate.parse(in.next());

        if (first.isBefore(sec)) {
            System.out.println("The date " + first + " is before " + sec);
        }
        else if (first.isAfter(sec)) {
            System.out.println("The date " + sec + " is before " + first);
        }
        else {
            System.out.println("Both dates are equal");
        }

        in.close();
    }
}
