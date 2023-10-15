package day14.solved;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo2 {

	public static void main(String[] args) {

		// today's Date
		LocalDate today = LocalDate.now();
           System.out.println(today);
		// Expected format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/y");
       System.out.println(formatter);
		// Converting date to the format
		String formattedDate = today.format(formatter);
		System.out.println(formattedDate);
	}

}
