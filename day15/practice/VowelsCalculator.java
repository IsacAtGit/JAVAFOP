package day15.practice;
import java.util.Scanner;
public class VowelsCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A Sentence");
    String sent=sc.nextLine();//got input
    sent=sent.toLowerCase().trim();//trimmed and changed into lowercase
    int count=0;
    for(int i=0;i<sent.length();i++) {
    	if(sent.charAt(i)=='a'||sent.charAt(i)=='e'||sent.charAt(i)=='i'||sent.charAt(i)=='o'||sent.charAt(i)=='v') {
    		count++;//incremented
    	}
    }
    System.out.println("The Number Of Vowels In Your Sentence Is "+count);//printed
    sc.close();
	}
   
}
