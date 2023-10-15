package day14.solved;

public class StringBuilderLoopAppender {
	public static void main(String[] args) {

		// Program to demonstrate creating a String
		// Appending a array of Strings
		String[] strArr = { "This", "is", "a", "collection", "of", "words",
				"to", "be", "appended", "to", "form", "a", "Sentence" };

		// Without String Builder : BAD Practice
		String newStrFromSent = "";
		for (String str : strArr) {
			// We are creating a new String everytime we do this
			newStrFromSent += str + " ";
		}
		System.out.println(newStrFromSent.trim()+"i am bad practice");
		

		// GOOD Practice: With String Builder

		StringBuilder strBuilderFromSent = new StringBuilder();

		for (String str : strArr) {
			// Just appending to an already existing object
			strBuilderFromSent.append(str);
			strBuilderFromSent.append(" ");
		}
		System.out.println(strBuilderFromSent.toString().trim()+"i am stringbuilder format");
	}
}
