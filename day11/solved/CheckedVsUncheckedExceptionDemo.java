package day11.solved;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUncheckedExceptionDemo {
	static int divider(int a, int b) throws ArithmeticException {//throws declaring this 
		                                                         //method will throw exception 
		//divider method not handle the exception it only throws it
		try {
			int c = a/b; // if b is zero
			return c;
		}
		catch (ArithmeticException ex) {
			throw ex; //if exception occur "throw" throw it
		}
	}
	
	static void fileHandlerDemo(String fileName) throws FileNotFoundException {
		try {
			// This line may throw a FileNotFoundException
			FileReader fileReader = new FileReader(fileName); 
			
		} catch (FileNotFoundException e) {
			throw e; // Handle the exception by printing the stack trace
		}
	}
	
	public static void main(String[] args) {
		try { //here the methods are tried
			Integer.parseInt("20");
			divider(8, 0); //Should throw an ArithmeticException
			fileHandlerDemo("hello.nothing");
			
		}
		
		catch(ArithmeticException ex) { 
		// all the arithmetic exception thrown  are catch here
			System.out.println("Catching the error in main method: " + ex.getMessage());
			ex.printStackTrace();
		}
		catch(FileNotFoundException ex) { //same as above
			System.out.println("Handling only FNFE");
		}
		finally { 
			System.out.println("Exception Introduction is completed");
		}
	}

}
