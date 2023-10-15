package day12.solved;

public class NumberValidationDemo {

	public static void main(String[] args) {

		int input = 6;

		if (input >=1 && input <= 10) { //validate number between some range
			System.out.println("The number is within the range [1, 10]");
		} else {
			System.out.println("The number is outside the range [1, 10]");
		}

	}

}
