package day06.practice;

public class ConcatPractice {
	public static void main(String[] args) {
		
		//input
        String firstName = "Isac" ;
        String middleName = "D" ;
        String lastName = "Abishek";
         
        //business logic
        String fullName =firstName.concat(" "+middleName.concat(" "+lastName));     
         
        //output
        System.out.println(fullName);
		
	}
}
