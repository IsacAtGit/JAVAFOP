package day14.practice;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DateAndTime1 {
	public static void main(String[] args) {
		// Getting inputs from the user
		LocalDate date1 = LocalDate.of(2002, 12, 15);
		LocalDate date2 = LocalDate.of(2023, 12, 12);
		//chronounit  Calculating the number of days between the two dates
		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		// Printing the result
		System.out.println("Number of days between the two dates: " + daysBetween);
	}
}
