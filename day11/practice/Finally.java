package day11.practice;

class UserAccounts{
	public static void validateUsername(String username) throws IllegalArgumentException {
		if (username == null) {
			// throw an Illegal Argument Exception
			throw new IllegalArgumentException("Invalid Username");
			// error message "Invalid Username"
		}
		if (username.length() < 8) {
			throw new IllegalArgumentException("Username must have atleast 8 chars");
			// throw an Illegal Argument Exception
			// with message "Username must have atleast 8 chars";
		}
		else {
			System.out.println("valid username");
		}
	}
	public static void validateAge(int age) {
		// Add your code here to validate
		// Throw an IllegalArgumentException
		if (age < 10) {
			throw new IllegalArgumentException("Invalid age");
		}
		else {
			System.out.println("valid age");
		}
		// With error msg "Invalid age"
	}
}
public class Finally {
	public static void main(String[] args) {
// Fix the compiler Errors as well after removing the
		// valid lines of code
		String username = "IsacDevaAbishek";
		int age = 18;
		try {
			// Add code to validate age
			UserAccounts.validateAge(age);
			UserAccounts.validateUsername(username);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("program completed");
		}
	}
}
