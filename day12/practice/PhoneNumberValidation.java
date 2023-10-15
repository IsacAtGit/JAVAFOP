package day12.practice;
import java.util.Scanner;
class Holder{
	static void NumberValidator(String a)  {
		if(a.length()==10&&a.charAt(0)!='0') { //checking the condition
			
			System.out.println(" valid number");//if true it will run
		}
		else {
			System.out.println("Enter a valid number");//if If didn't happen else will run
		}
	}
}
public class PhoneNumberValidation {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	
	String number=sc.nextLine();
	Holder.NumberValidator(number); //method is invoked
	sc.close();
}
  
}
