package day13.practice;


import java.util.regex.Pattern;

class User {
	int id;
	String name;
	String password;
	String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
}
class UserValidator{
	static void validate(User b) {
         String regexEmail = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
         String regexPass = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=])(?=.*[!-~]).{8,}$";
         
		
		Boolean isMatchPass = Pattern.matches(regexPass, b.getPassword());
		Boolean isMatchMail = Pattern.matches(regexEmail, b.getEmail());
		
		if (isMatchMail) {
			System.out.println("The email address is: Valid");
		} else {
			System.out.println("The email address is: Invalid");
		}
		if (isMatchPass) {
			System.out.println("The password is: Valid");
		} else {
			System.out.println("The password is: Invalid");
		}
		if(b.getId()>0) {
			System.out.println("ID is valid");
		}
		else {
			System.out.println("ID is Invalid");
		}
		if(b.getName().length()<=1) {
			System.out.println("Name is Invalid");
		}
		else {
			System.out.println("Name is valid");
		}
	}
}

public class UserValidations {
 public static void main(String[] args) {
	User user=new User();
	user.setId(0);
	user.setName("Is");
	user.setPassword("Is@2");
	user.setEmail("isacdevaasbishek2@gmail.com");
	UserValidator.validate(user);

}
} 
