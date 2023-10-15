package day11.solved;

public class NullString {
  public static void main(String[] args) {
	  String name="itachi";
	  System.out.println(name.indexOf("hi")); //index of "hi" is printed
  
	String msg=null;//string  with value null 
	System.out.println(msg.indexOf("hi")); //index of "hi" is printed(compiler will shout error)
}
}
