package day12.practice;
import java.util.*;
public class StringLengthValidation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int check;
		Scanner scan =new Scanner(System.in);
		do {
			check=0;
			
			System.out.println("Enter the string :");
			String string= scan.next();
			if(string.length()>=8&&string.length()<=15 ) {
				check=1;
				System.out.println("Success string is 8-15 chars");
			}else {
				System.out.println("Enter a valid String");
			}
			
		}while(check==0);
		scan.close();
	}

}
