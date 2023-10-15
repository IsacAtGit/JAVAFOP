package day14.practice;
import java.time.LocalDate;
public class DateAndTime2 {
	public static void main(String[] args) {
		// Declaring variables and initializing values
		int year = 2002;
        int month = 12;
        int day = 15;
        
        // Create a LocalDate object representing your birthday
        LocalDate birthday = LocalDate.of(year, month, day);

        // Print the birthday
        System.out.println("My birthday is: " + birthday);
	}
}
