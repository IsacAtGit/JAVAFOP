package day18.solved;

/**
 * Validation Util for validating specific fields
 * 
 * @param age
 * @return
 */


/**
 * Main class to test the validation Util class without using JUNIT
 */
public class TestValidationUtil {
	public static void main(String[] args) {
		// test case to check if the valid age is validated correctly
		testPostiveValidateAge();

		// test case if exception is thrown if we send a negative or zero value
		testNegativeValidateAge();
	}

	/**
	 * It will pass a positive number to validateAge method and print if the
	 * test case has passed else it will print test case failed
	 */
	public static void testPostiveValidateAge() {
		
		if(ValidationUtil1.validateAge(9)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}

	}
	
	/**
	 * It will pass a -ve number to validateAge method and print the
	 * test case has passed if an exception is thrown else it will print 
	 * test case failed
	 */
	public static void testNegativeValidateAge() {
		try {
			ValidationUtil1.validateAge(8);
			System.out.println("Test case failed");
		}
		catch (IllegalArgumentException ex) {
			System.out.println("Test case passed");
		}

	}

}
