package day11.solved;

public class NullPointerExceptionDemo {
	

		public static void main(String[] args) {
			
			String name = null;//string name is  with value null 
			
			try {
				
				int length = name.length();//length is not work on null
				System.out.println(length);
				
			} catch (Exception e) {

				System.out.println(e.getMessage());//so the exception is caught here
				e.printStackTrace();
				
			}

		}

	
}
