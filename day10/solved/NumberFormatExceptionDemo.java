package day10.solved;


class  holder{
    public static void method1() {
    	holder2.method2();
	}
}

class holder2{
	public static void method2() {
		holder3.method3();
	}
}
class holder3{
	public static void method3() {
		String ageStr = "Twenty";
		int age = Integer.parseInt(ageStr);// Throws an NFE exception
		System.out.println("Age convered" + age);
	}
}

public class NumberFormatExceptionDemo {
	public static void main(String[] args) {
		try {
			holder.method1();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}