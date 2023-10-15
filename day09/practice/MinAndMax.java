package day09.practice;
import java.util.Scanner; //importing the scanner method from java util packages

public class MinAndMax {
 public static void main(String[] args) {
	 int n;  
	 Scanner scan=new Scanner(System.in);  //method to get input from user
		
		
		System.out.print("give no of elemnts should be in array ");  
		//reading the input numbers  
		n=scan.nextInt();  
		//creates an array in the memory of length n  
		int[] array = new int[n];  // n assigned to the array
		System.out.println("Enter the elements:  ");  
		  //loop runs for the n times and the values form the user
		  //are stored in the array with for loop
		for(int i=0; i<n; i++){  
		//reading array elements from the user   
		array[i]=scan.nextInt();  
		}  
		
	
	 int max=0;
	 int min=999999999; // assuming the max as 999999999
	 for(int el:array) {
		 if(el>max) {
			 max=el;
		 }
		 if(el<min) {
			 min=el;
		 }
	 }
	 System.out.println("Max value in given input is "+max+" Min value in given input is "+min);
	  scan.close();
}
}
