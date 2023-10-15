package day14.solved;

//import java.time.LocalDate;
//import java.time.LocalDateTime;

import java.time.*;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		Date date = new Date(); // EX:Tue Jun 20 10:04:58 IST 2023
		System.out.println(date);

		LocalDate today = LocalDate.now();//EX:2023-06-20
		System.out.println(today);

		LocalDateTime now = LocalDateTime.now();//EX:2023-06-20T10:04:58.666569200
		System.out.println(now);

	}

}
