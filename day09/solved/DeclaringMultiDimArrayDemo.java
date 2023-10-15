package day09.solved;

public class DeclaringMultiDimArrayDemo {
	public static void main(String[] args) {
		int[][] twodArray = { { 1, 2, 3 }, 
							  { 4, 5, 6 }, 
							  { 7, 8, 9 } };

		// Accessing twodArray

		System.out.println("Printing the first "
				+ "element in the first row "
				+ twodArray[0][0]);
		
		System.out.println("Accessing the third "
				+ "element in the Second row "
				+  twodArray[1][2]);
		
		// Creating a dynamic multi-dimentional array
		
		int[][] dynamic2dArray = new int[5][5];
		
		// Setting the first element in the first row as 5
		dynamic2dArray[0][0] = 5;
		

	}
}