import java.time.LocalDate;
import java.util.Scanner;
public class ArithmaticDate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Date=in.next();
        LocalDate date = LocalDate.parse(Date);
		LocalDate add7days=date.plusDays(7);
		LocalDate addMonth=add7days.plusMonths(1);
		LocalDate addYears=addMonth.plusYears(2);
		LocalDate minusWeek=addYears.minusWeeks(3);
		System.out.println("The Original date is = "+Date+"/n"  
				            + "  The final date after the operation is = "+minusWeek);
	}

}
