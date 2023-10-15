package day15.practice;
import java.util.Scanner;
public class ReverseWord {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any sentence ");
		String strArr = scan.nextLine();
		
	
		
		scan.close();
		
		
		// GOOD Practice: With String Builder
				StringBuilder strBuilderFromSent = new StringBuilder();
		String[] splitArr=strArr.split(" ");
				
				for(int i=splitArr.length-1;i>=0;i--) {
					strBuilderFromSent.append(splitArr[i]);
					strBuilderFromSent.append(" ");
					
				}
				System.out.println(strBuilderFromSent.toString().trim());
	}
}