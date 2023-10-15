package day12.practice;
import java.util.Scanner;
class Holder1{
	static void EmailValidator(String a)  {
		 int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='@'||a.charAt(i)=='.') { //checking the condition
				count=count+1;
			}
			
		}
		if(count==2){ //if count=2  print valid email
			System.out.println("valid email");//if If didn't happen else will run
		}
		else {
			System.out.println("invalid email");
		}
		
		
		
	}
}
public class EmailValidator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your mail");
		
		String mail=sc.nextLine();
		Holder1.EmailValidator(mail); //Email Validator method initialized
		sc.close();
		
		
	}

}
