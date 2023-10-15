package day15.solved;


import java.util.Scanner;

public class ScannerIntDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //scanner class
		System.out.println("Enter a your age: ");
		int name = scanner.nextInt(); //scanning integer
		System.out.println("Your age is: " + name);
		scanner.close();

	}

}
