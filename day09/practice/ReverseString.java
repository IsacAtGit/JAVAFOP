package day09.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr= {"isac","Deva","abishek","zoro","sanji","naruto","sasuke"};//arr of strings
		for(int i=0, j=arr.length-1;i<arr.length/2;i++,j--) {
			String temp; //swapping the variable by using temp variable
			temp=arr[j];
			
			arr[j]=arr[i];
			arr[i]=temp;
			
		}
		for(String el:arr) {
			System.out.println(el); //arr is printed
		}
		

	}

}
