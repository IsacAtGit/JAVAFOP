package day10.practice;
import java.util.Scanner;
public class ExeptionalHandlingPractice {
 public static void main(String[] args) {
	 Scanner s = new Scanner (System.in);
	 System.out.println("Enter your Marks: ");
	 int intStr = s.nextInt();
	 System.out.println("Enter your Number of subject: ");
	 int intStr2 = s.nextInt();
	 try {
		 int result=intStr/intStr2;
		 System.out.println(result);
	 }
	 catch(ArithmeticException e) {
		 System.out.println(e.getMessage());
		 e.printStackTrace();
	 }
 s.close();
}
}
