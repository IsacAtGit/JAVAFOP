package day06.hot;

public class PrintCount {
	public static void main(String [] args) {
     String word="I love Java but Java is challenging!";
     String [] arr=word.split(" ");
    
     for(int i=0;i<arr.length;i++) {
    	 int count=0;
    	 for(int j=0;j<arr.length;j++) {
    		
    		 if(arr[i].equals(arr[j])) {
    			 count+=1; 
    	 }
     }
    	 System.out.println(arr[i]+"-"+count);
	}
}
}