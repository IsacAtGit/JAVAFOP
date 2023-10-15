package day08.practice;
import java.util.Scanner; //importing the scanner method from java util packages
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); //scanner method is used to get input from the user
		System.out.println("any number");
		
        int a;
		a=scanner.nextInt();//this method scan the number from user
		long count=0;
		for(int i=0;i<a;i++) { //loop run until the user given value
			count=count+i;
		}
        System.out.println("the sum of natural number from 1 to "+a+" is "+count);
        scanner.close();
	}

}
