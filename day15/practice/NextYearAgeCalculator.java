package day15.practice;
import java.util.Scanner;
public class NextYearAgeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.nextLine();//got name
		System.out.println("Enter Your Age");
		int age=sc.nextInt();//got age
		
		System.out.println("Hello "+name+" next year you will be "+(age+1));//print
      sc.close();
	}

}
