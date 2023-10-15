package day06.practice;

public class LengthAndFirstLetter {
   public static void main(String [] args) {
	   String hello="hello world";
	   //.length find the length of the string
	   System.out.println("the length of the predefined variable hello is "+hello.length());
	   //.substring used to find the values from the index to length
	   System.out.println("the first letter is "+hello.substring(0,1)+" in "+hello);
	   //.charat used to find the letter in that index
	   System.out.println("the first letter is "+hello.charAt(0)+" in "+hello);
   }
}
