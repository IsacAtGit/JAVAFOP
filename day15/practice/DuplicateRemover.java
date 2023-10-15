package day15.practice;

import java.util.Scanner;

class duplicate {
	public static void removeDuplicate(String inputdata) {
		StringBuilder strBuilderFromSent = new StringBuilder();
// removing the duplicates
		for (int i = 0; i < inputdata.length(); i++) {

			char chara = inputdata.charAt(i);
			System.out.println(strBuilderFromSent.indexOf(String.valueOf(chara)));
			
			//If the character chara is not found in the StringBuilder, the method returns -1.
			if (strBuilderFromSent.indexOf(String.valueOf(chara)) == -1) {
				strBuilderFromSent.append(chara);
			}

		}

		System.out.println("The word without duplicate letters " + strBuilderFromSent.toString().trim());

	}
}

public class DuplicateRemover {
	public static void main(String[] args) {



		Scanner scan = new Scanner(System.in);

		System.out.print("Enter any sentences ");
		String inputstring = scan.nextLine();

		duplicate.removeDuplicate(inputstring);

		scan.close();
	}

}