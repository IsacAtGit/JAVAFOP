package day05.solved;
import java.util.Scanner; //importing the scanner method from java util packages



class MathUtil {
	
	// A static is used when you have to call method without an object
	public static boolean isEven(int num) {
		return (num % 2) == 0;  //if the value =0 print true otherwise false
	}
}

//public class MathUtilDemo {
public class StaticDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); //scanner method is used to get input from the user
		System.out.println("give number");
        int a;
		
		a=scanner.nextInt();//this method scan the number from user 
		
		System.out.println(MathUtil.isEven(a));
		
		//Example of static methods from java Library
		Integer.parseInt("10");
		Math.sqrt(3);
		scanner.close();
	}
}


