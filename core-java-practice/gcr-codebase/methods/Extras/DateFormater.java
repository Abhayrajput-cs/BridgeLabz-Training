import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormater {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter3 =
                DateTimeFormatter.ofPattern("dd MMM, EEE");

        System.out.println(today.format(formatter));
        System.out.println(today.format(formatter2));
        System.out.println(today.format(formatter3));
    }
}
