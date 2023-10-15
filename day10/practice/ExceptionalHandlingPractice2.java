package day10.practice;
import java.util.Scanner;
public class ExceptionalHandlingPractice2 {
 public static void main(String[] args) {
	 Scanner s = new Scanner (System.in);
	
	    int count=0;
	 do {
		 
		 try {
			 System.out.println("Enter your Integer: ");
			 String intStr = s.nextLine();
			 int num1=Integer.parseInt(intStr);
			 count=0;
			 System.out.println("valid number is "+num1);
			 s.close();
		 }
		 catch(NumberFormatException e) {
			 System.out.println("Enter a valid number as a string");
			 count=1;
		 }
		
	 }
	 while(count==1);
	 
}
}
