package day07.solved;
import java.util.Scanner; //importing the scanner method from java util packages
public class ScannerDemo {

	public static void main(String[] args) {
		
				//Reading a String
				Scanner s = new Scanner (System.in);
				System.out.println("Enter your Name: ");
				String userName = s.nextLine();
				System.out.println("Hello " + userName + " Welcome to FSSA Hacker");
				
				
				System.out.println("What your age:");
				int age = s.nextInt();
				System.out.println("The age your have typed: " + age);
				
				//Flushing the new line that was entered while entering the integer
				s.nextLine();
				
				//Reading a line
				System.out.println("In a line Tell me more about yourself: ");
				String aboutUrSelf = s.nextLine();
				System.out.println("What you have typed: " + aboutUrSelf);
				
				System.out.println("Reading a character:");
				String charReadStr = s.nextLine();
				char charRead = charReadStr.charAt(0);
				System.out.println("Character Read: " + charRead);
				         
				s.close();
				
		
	}

}
