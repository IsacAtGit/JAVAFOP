package day14.solved;

public class StringBufferDemo {

	public static void main(String[] args) {
        
	
		String lastName = " Tendulkar";

		StringBuffer fullName = new StringBuffer();
		fullName.append("isac");
		fullName.append(" ");
		fullName.append(lastName);

		System.out.println(fullName);

	}

}
