package day09.hots;

public class Transpose { // create a public class	​
	public static void main(String[] args) { // main method starts
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Initialize the integer array
		System.out.println("The Transpose of the Matrix"); // output
		
		for (int i = 0; i < array[0].length; i++) { // Initialize the for loop to reverse the index
			
			for (int j = 0; j < array[0].length; j++) {
				
				System.out.print(array[j][i] + " "); // output with empty space
			}
			System.out.println(); // print new line
		}
	} // main method ends
}
