package day07.practice;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter your character: ");
		String vowel;
		   vowel=s.nextLine();//this method scan the char
		   vowel=vowel.toLowerCase();
		   char vowels=vowel.charAt(0);
		   if(vowels=='a'||vowels=='e'||vowels=='i'||vowels=='o'||vowels=='u') {
			   System.out.println("the letter or the first letter you given is a vowel");
		   }
		   else {
			   System.out.println("the letter or the first letter you given is a constonant");
		   }
		   s.close();
	}

}
