package day07.practice;
import java.util.Scanner; //importing the scanner method from java util packages
public class PositiveAndNegativeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);//method to get input from user
		System.out.println("Enter a number: ");
		int userNumber = s.nextInt(); //nextInt used to get an integer
	   
		if(userNumber>0) { //if condition pass it will executed
			System.out.println("you entered a poistive number");
		}
		else if(userNumber==0) {//if condition fail it will check else if condition
			System.out.println("your number is 0");
		}
		else if(userNumber<0) {//if else if condition fail it will check next else if condition
			System.out.println("you entered a negative number");
		}
		else { //if all condition fails it execute else statement
			System.out.println("enter a valid number");
		}
		s.close();
	}
	

}
