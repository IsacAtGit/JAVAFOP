package day08.hot;

public class ReversePyramid {
	public static void main(String[] args) {
		int a=5+5;
		String star="*";
		String gap=" ";
		
		
		for(int i=0;i<a;i++) {
			
			String result="";
			
			for(int j=0;j<i;j++) {
				result=result+gap;  //this loop for add space
				
			}
			for(int k=i;k<0;k++) {
				result=result+star; //this loop for ad star
				
			}
			for(int o=i;o<=a-1;o++) {
				result=result+star+gap; //this loop for making pyramid
			}
			
		
			System.out.println(result);
		}
	

	}

}
