package day08.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
			  int i,prime=0;      
			  int n=7;//it is the number to be checked  
			  if(n==0||n==1){  //if the value is 0 or 1  if will run
			   System.out.println(n+" is not prime number");      
			  }
			  else{  //if the If condition is false the else part execute
			   for(i=2;i<=n/2;i++){  //loop starts from 2 because no need to divide the value by 0 and 1     
			    if(n%i==0){ //the given number is divided by i       
			     System.out.println(n+" is not prime number");//if the number divided and the remainder
			                                                  //is 0 the number is divide by i
			     prime=1;      
			     break;      
			    }      
			   }      
			   if(prime==0){ 
				   System.out.println(n+" is prime number");
			   }  
			  }//end of else  
			}    
			 

}
