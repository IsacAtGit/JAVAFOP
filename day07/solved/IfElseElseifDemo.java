package day07.solved;

public class IfElseElseifDemo {
public static void main(String[] args) {
	
	        int marks = 85;

	        if (marks >= 90) { //if condition true if executed
	            System.out.println("Grade: A+");
	        } else if (marks >= 80) {//if if condition fails else if executed
	            System.out.println("Grade: A");
	        } else if (marks >= 70) {//if above if else condition fails this else if executed
	            System.out.println("Grade: B");
	        } else if (marks >= 60) {  //if above if else condition fails this else if executed
	            System.out.println("Grade: C");
	        } else {// if all condition fails else will executed
	            System.out.println("Grade: F");
	        }
	    
 }
}
