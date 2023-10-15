package day06.practice;
import java.util.Scanner; //importing the scanner method from java util packages

class Spliter{
	public static void Splitmethod(String Name) {
		 
		   String [] Splits=Name.split(" ");//split method split the words before the " " and save it array
		   for(String x:Splits){
			   System.out.println(x); //for each method prints the values in the array
			   } 
	}
}

public class Split {
	   public static void main(String [] args) {
		   Scanner scanner=new Scanner(System.in); //scanner method is used to get input from the user
		   System.out.println("enter your name");
		String b=scanner.nextLine();//this method scan the number from user 
		   String name=b;
		   Spliter.Splitmethod(name);
		  scanner.close();
	   }
}
