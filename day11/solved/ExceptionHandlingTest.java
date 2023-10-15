package day11.solved;
class Holder{ 
	static int divider() { //method
		int a=20;
		int b=0;
		return a/b; //line causes exception
	}
}
public class ExceptionHandlingTest {
  public static void main(String[] args) {
	try {
		Holder.divider(); //the static method is called
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage()); //exception message is got
		e.printStackTrace();// trace the exception in stack and print it
	}
}
}
