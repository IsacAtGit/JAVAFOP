package day15.solved;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionHandlingDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a your age: ");
		
		try {

			int name = scanner.nextInt();
			System.out.println("Your age is: " + name);			
	
		} 
		catch( InputMismatchException e) { //if user give other than integer

			System.out.println("Invalid age input");
			e.printStackTrace();

		}

		scanner.close();

	}

}
