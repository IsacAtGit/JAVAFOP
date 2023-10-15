package day09.hots;

public class SecLargeNo { // create a class
	public static void main(String[] args) { // main method starts
		int[] intArray = { 4, 23, 2, 1, 5, 6, 77, 5, 10, 100 }; // create a integer array with some random numbers
		int temp; // create a temporary variable to assign the values
		for (int i = 0; i < intArray.length; i++) { // Initialize the for loop for a linear sort
			for (int j = 0; j < intArray.length; j++) {
				if (intArray[i] < intArray[j]) { // if the first index of array is lesser than second index of the array
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
//		for (int k = 0; k < intArray.length; k++) { // to print the values in the array
//			System.out.println(intArray[k]);
//		}

		// output
		System.out.println("The Second Largest Value in Array : " + intArray[intArray.length - 2]);
		System.out.println("The Second Smallest Value in Array : " + intArray[1]);

	} // main method ends
}
