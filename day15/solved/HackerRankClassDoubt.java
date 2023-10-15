package day15.solved;
import java.util.*;
public class HackerRankClassDoubt {
	public static void main(String[] args) {
		// Read a integer using nextInt()
		int dummyInt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter an Integer \n" + "Adding another line now enter:");
		dummyInt = sc.nextInt();
		// Do a dummy nextLine();

		double secondInt = sc.nextDouble();
//		sc.nextLine(); // dummy call
		System.out.println("Second num: " + secondInt);
		// Do a read nextLine for reading the String?
		System.out.println("Enter a string:");
		String strFromUsr = sc.nextLine();
		System.out.println(
				"String from user: " + strFromUsr + "After the str print");

	}

}