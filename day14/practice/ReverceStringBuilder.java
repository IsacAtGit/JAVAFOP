package day14.practice;
import java.util.Scanner;
  public class ReverceStringBuilder {
	public static void main(String[] args) {
		// Getting the sentence from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String sentence = scanner.nextLine();
		// Splitting the sentence into words
		String[] words = sentence.split(" ");
		// Creating a StringBuilder object
		StringBuilder reversedSentence = new StringBuilder();
		// Appending the words in reverse order to the StringBuilder object
		for (int i = words.length - 1; i >= 0; i--) {
			reversedSentence.append(words[i]);
			reversedSentence.append(" ");
		}
		// Printing the sentence
		System.out.println("Reversed sentence: " + reversedSentence.toString());
		scanner.close();
	}
}
