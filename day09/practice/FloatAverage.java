package day09.practice;

public class FloatAverage {
	public static void main(String[] args) {
		   float[] intArr= {1.34F,45.67432F,22.7843F,5.6372F,34.89F}; // array with elements
		   float sum=0;
		   for(float el:intArr) { // applying for each method
			   sum=sum+el; //elements in the variable is added one by one
			 
		   }
		   sum=sum/intArr.length; //sum of the elements is divided by the length of the array
		   System.out.println(sum);
		}
}
