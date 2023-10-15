package day12.solved;

import java.util.Scanner;

public class StringValidationDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scans the input
		System.out.println("enter your name");
		String input = sc.nextLine(); // read the string

		if (input == null) {// if the string is null
			System.out.println("The input String is Null");
		} else if (input.trim().isEmpty()) { // if the string is empty
			System.out.println("The input String is Empty");
		} else {
			System.out.println("The Input String is: " + input);
		}
		sc.close();
	}
}
