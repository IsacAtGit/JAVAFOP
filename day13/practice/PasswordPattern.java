package day13.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class PasswordPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();//scan the output
        

        try {

        	PasswordValidator.isValidPassword(password); //passing augment
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); //get exception message
            
        }
        scanner.close();
    }
}

class PasswordValidator {
    public static boolean isValidPassword(String password) {
        // Regex pattern for validating the password
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=])(?=.*[!-~]).{8,}$";
        Pattern pattern = Pattern.compile(regex); //compiles the given pattern 
		Matcher matcher = pattern.matcher(password); //matcher matches the given string with compiled pattern
		Boolean isMatch = matcher.matches(); //give final output as true or false
        if (isMatch) {
            // Password matches the pattern 
        	System.out.println("valid password");
            return true;
        } else {
            // Password does not meet the requirements, throw exception with error message
            throw new IllegalArgumentException("Password does not meet the requirements.");
        }
    }
}

