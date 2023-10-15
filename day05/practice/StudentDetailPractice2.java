package day05.practice;

class StudentDetail{
	String name;
	int age;
	int mark;
	public void setStudentDetails(String studentname, int studentage ,int studentmark) {  //method to set the student details to the variable by aruguments
		 name=studentname;
		 age=studentage;
		 mark=studentmark;
	}
	public String getstudentdetails() {  //method to print or get the student details
		System.out.println("HI "+name+" your age is "+age);
		return ("your mark is "+mark);
	}
}
public class StudentDetailPractice2 {
	public static void main(String [] args) {
		StudentDetail studentobj = new StudentDetail(); //creating the obj for student details to access the methods
	    studentobj.setStudentDetails("Zoro", 23, 97);
	    
	    System.out.println(studentobj.getstudentdetails());//student details printed
	}
      
}
