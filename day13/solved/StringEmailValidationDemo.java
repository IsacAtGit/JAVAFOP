package day13.solved;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEmailValidationDemo {

	public static void main(String[] args) {

		String email = "isacdevaabsihek2@gmail.com";
	
		// Below is a Regex by RFC standard RFC 5322
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		
		Pattern pattern = Pattern.compile(regex); //compiles the given pattern 
		Matcher matcher = pattern.matcher(email); //matcher matches the given string with compiled pattern
		Boolean isMatch = matcher.matches(); //give final output as true or false
//		Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			System.out.println("The email address is: Valid");
		} else {
			System.out.println("The email address is: Invalid");
		}

	}

}
