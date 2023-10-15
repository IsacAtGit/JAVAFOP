package day03.hot;

public class ImplicitExplictConversion {
   public static void main(String [] args) {
	   int a=10;
	   long b=a;//int is converted into long by implict conversion
	   System.out.println("int value "+a+" is converted into long "+b+" implict conversion");
	   
	   
	   double c=25.767;
	   int d=(int)c;//double is converted into long by explict conversion
	   System.out.println("double value "+c+" is converted into int "+d+" explict conversion");
	   
   }
}
