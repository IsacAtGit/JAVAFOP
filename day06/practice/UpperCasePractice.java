package day06.practice;

class UpperCase {
	
	public static String  UppercaseConvert(String name) { //static upper case converter method
//		                                                  which return sting 

		return name.toUpperCase(); //toUpperCase convert string upper case
	}
}
public class UpperCasePractice {

	public static void main(String[] args) {
	
		System.out.println(UpperCase.UppercaseConvert("john doe")); //uppercaseconvert method called from the
		                                                            //uppercase class
	
	}
}
