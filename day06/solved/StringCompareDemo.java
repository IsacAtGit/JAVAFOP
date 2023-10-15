package day06.solved;

public class StringCompareDemo {

	public static void main(String[] args) {

		// input
		String name1 = "    isac    ";
		String name2 = "isac";
		

		// output
		System.out.println("Comparing without .trim()");
		System.out.println("Comparing using comparsion operator (==): " + (name1 == name2));//false
		System.out.println("Comparing using .equals() method: " + name1.equals(name2));//false

		System.out.println("\nComparing with .trim()");
		System.out.println(name1.trim() == name2.trim());//false  it comparing the memory location
		System.out.println(name1.trim().equals(name2.trim()));//true it comparing the value 
	}

}
