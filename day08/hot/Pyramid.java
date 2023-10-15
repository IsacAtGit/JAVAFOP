package day08.hot;

public class Pyramid {

	public static void main(String[] args) {
		int a=5;
		String star="*";
		String gap=" ";
		
		
		for(int i=0;i<a;i++) {
			
			String result="";
			for(int j=i;j<a-1;j++) { //this loop for add space
				result=result+gap;
				
			}
			for(int k=0;k<=i;k++) { //this loop for adding star to the gap
				result=result+star;
				
			}
			for(int o=0;o<i;o++) {
				result=result+star; //this loop for  right half of the pyramid
			}
			System.out.println(result);
		}
	

	}

}
