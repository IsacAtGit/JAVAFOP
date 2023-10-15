package day13.solved;



class DivisionNumber{
	static int divider(int a,int b) throws ArithmeticException{ //method
		if(b==0) {
			throw new ArithmeticException("Enter valid divisor");
		}
		return a/b; //line causes exception
	}
}
public class DividerDemoByTryCatch {
	public static void main(String[] args) {
		try {
			System.out.println(DivisionNumber.divider(10,0));
			 //the static method is called
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()); //exception message is got
			e.printStackTrace();// trace the exception in stack and print it
		}
	}
}
