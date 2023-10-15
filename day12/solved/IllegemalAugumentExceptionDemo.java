package day12.solved;
class Holder{
	public static int divider(int a,int b) throws IllegalArgumentException {
		if(b==0) { //validates the divisor number
			throw new IllegalArgumentException(b+" cant be zero"); //throw a illegalexception error
		}
		int result=a/b;
		return result;
	}

}
public class IllegemalAugumentExceptionDemo {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(Holder.divider(10, 0));
	}

}
