package day05.practice;
import java.util.Scanner; //importing the scanner method from java util packages


class operators{
	char operator;
	int number1;
	int number2;
	
	public void gettinginputs(char op, int num1 ,int num2) {  //method to set the get input to the variable by aruguments
		operator=op;  //assigning the values to variables
		number1=num1;
		number2=num2;
         
		switch(operator) {
		   case '+':
			   System.out.println(number1+number2);
//			  + operator
			   break;
		   case '-':
			   System.out.println(number1-number2);
//			   - operator
			   break;
		   case '*':
			   System.out.println(number1*number2);
//			  * operator
			   break;
		   case '/':
			   System.out.println(number1/number2);
//			   / operator
			   break;
		   case '%':
			   System.out.println(number1%number2);
//			   % operator
			   break;
		default: //if the values in case or not equal default will print
			System.out.print("wrong operator");
		   }


		}
	}
   

public class Calculator2 {
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in); //scanner method is used to get input from the user
		System.out.println("give number1");
        int a,b;
		
		a=scanner.nextInt();//this method scan the number from user 
		System.out.println("give number2");
		b=scanner.nextInt();//this method scan the number from user 
		char operatorv;
	   System.out.println("opertator");
	   operatorv=scanner.next().charAt(0);//this method scan the char
	   
	   
	   
	  operators operatorobj = new operators(); //creating the obj for operators to access the methods
	  operatorobj.gettinginputs(operatorv, a, b); // send the user given values to the arguments
	    
	    
	  scanner.close();
	}
      
}