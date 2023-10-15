package day10.solved;

public class ExceptionalHandlingDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
//	int result=a/b;
//	System.out.println(result);//result without try catch
		try {
			int result = a / b;
			System.out.println(result); // if no error result will be printed
		} catch (ArithmeticException e) { // in built method for exceptions in arithmetic operators
			System.out.println(e.getMessage()); // .get message got the error message
		}
	}
}
