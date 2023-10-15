package day07.practice;
import java.util.Scanner; //importing the scanner method from java util packages

public class DaysOfWeek {
	public  static  void  main(String[] args) {	
		Scanner scanner=new Scanner(System.in); //scanner method is used to get input from the user
		System.out.println("give number1");
        int day;
		
		day=scanner.nextInt();//this method scan the number from user 
		switch (day) {
			case  1: //check for the value if value is equal to case value it will executed
				System.out.println("Today is Monday");
				break;
			case  2://check for the value if value is equal to case value it will executed
				System.out.println("Today is Tuesday");
				break;
			case  3://check for the value if value is equal to case value it will executed
				System.out.println("Today is Wednesday");
				break;
			case  4://check for the value if value is equal to case value it will executed
				System.out.println("Today is Thursday");
				break;
			case  5://check for the value if value is equal to case value it will executed
				System.out.println("Today is Friday");
				break;
			case  6://check for the value if value is equal to case value it will executed
				System.out.println("Today is Saturday");
				break;
			case  7://check for the value if value is equal to case value it will executed
				System.out.println("Today is Sunday");
				break;
			default://if all the condition is false default will be executed
				System.out.println("Invalid day");
				break;
		}
		scanner.close();
	}
}
