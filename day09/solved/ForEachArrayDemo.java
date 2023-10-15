package day09.solved;

public class ForEachArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 6, 19, 10 };
		int sum = 0;
		// For Each Syntax for looping with each element
		for (int element : arr) {
			sum += element; // Summing up each element
			System.out.println("Added element: " + element);
		}
		System.out.println("Sum of elements: " + sum);
	}
}
