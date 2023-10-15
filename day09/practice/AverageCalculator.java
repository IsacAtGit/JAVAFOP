package day09.practice;

public class AverageCalculator {
	public static void main(String[] args) {
	   int[] intArr= {1,45,22,54,34}; // array with elements
	   int sum=0;
	   for(int el:intArr) { // applying for each method
		   sum=sum+el; //elements in the variable is added one by one
		 
	   }
	   sum=sum/intArr.length; //sum of the elements is divided by the length of the array
	   System.out.println(sum);
	}

   
}
