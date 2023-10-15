package day05.solved;
import java.util.Scanner; //importing the scanner method from java util packages
class Account{
	String accno="";
	double balance;
	String name="";
	public void setName(String acname,double deposit, String accountno){ //this method set value
		accno=accountno;
		balance=deposit;
		name=acname;
	}
public void viewAccountDetails(){ //this method print account details
		System.out.println("name: "+name +"\n"+"balance: "+balance+"\n"+"account number"+accno);
	}
	public boolean withdraw(double amount) { //withdraw amount method
	
		
		if(balance>amount) { //checking amount is less than a balance amount
			balance=balance-amount;
			System.out.println(balance +" avilable balance"); // printing the available balance
			return true;
		}
		else {
			System.out.println("not enough balance"); // if amount is greater than balance 
			return false;
		}
	}
	
}



public class BankingApp {
  public static void main(String [] args) {
	  Scanner scanner=new Scanner(System.in); //scanner method is used to get input from the user
	  Account obj=new Account();
	    obj.setName("isac",5000,"0023456789098765");
	    obj.viewAccountDetails();
		System.out.println("enter withdrawl amount");
		int b=scanner.nextInt();//this method scan the number from user 
		
	  obj.withdraw(b);
	  scanner.close();
	  
  }
}
