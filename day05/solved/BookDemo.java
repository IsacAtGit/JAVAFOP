package day05.solved;

class books{
	String name;
	public void display() { //display is a method doing some kind of work
		System.out.println("display meathod is called and it is printed"); //it is statement
	}
	public void namePrinter() { //name printer is a method
		System.out.println("hello "+name+" book name printer meathod is called");//it is a statement
	}
}

public class BookDemo {
	 public static void main(String[] args) {
	    	books bookObj=new books(); //book is class name and it is a reference for the bookobj variable
	                                 //new is keyword
	    	                         //book() is creating object for the book class and save it in the bookobj variable
	    	bookObj.name="isac"; //setting the name to to the variable
	    	bookObj.namePrinter();//printer method in book class is called by the bookobj
	    	bookObj.display();//display method in book class is called by the bookobj
	    	
	    }
}
