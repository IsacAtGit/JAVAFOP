package day14.solved;

public class StringBuilderDemo {

	public static void main(String[] args) {
    
      String firstName = "Virat ";
      String lastName = "Kohli";
      
      StringBuilder fullName = new StringBuilder();
      fullName.append(firstName).append(" ").append(lastName);
      
      System.out.println(fullName);
	
	}

}
