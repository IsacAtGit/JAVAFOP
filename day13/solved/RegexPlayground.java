package day13.solved;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrate Simple RegEx and also create simple RegExs
 * Its a Playground
 * @author BharathwajSoundarara
 *
 */
public class RegexPlayground {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exitCode = "Continue";
		
		while (!"exit".equalsIgnoreCase(exitCode)) {
			// Reading the RegEx from the user
			System.out.println("Enter the regex: ");
			String regEx = sc.nextLine();
			Pattern pattern = Pattern.compile(regEx);
			
			// Reading the string to search using the RegEx
			System.out.println("Enter input string to search: ");
			String inputString = sc.nextLine();
			
			// Match the String Entered by the user
			// With the RegEx they had shared
			Matcher matcher = pattern.matcher(inputString);

			boolean found = false;
			
			while (matcher.find()) {
				System.out.printf("I found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
						matcher.group(), matcher.start(), matcher.end());
				found = true;
			}
			if (!found) {
				System.out.format("No match found.%n");
			}
			System.out.println("Type exit to exit code or continue: ");
			exitCode = sc.nextLine();
		}
		sc.close();
	}
}