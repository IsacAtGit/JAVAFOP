package day14.practice;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateAndTime4 {
	public static void main(String[] args) {
		// Creating a Date object
		Date currentDate = new Date();
		// Format for date and time
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		// Formating the current date and time
		String formattedDate = dateFormat.format(currentDate);
		String formattedTime = timeFormat.format(currentDate);
		// Printing the formatted current date and time
		System.out.println("Today's date is " + formattedDate + " and current time is " + formattedTime);
	}
}
