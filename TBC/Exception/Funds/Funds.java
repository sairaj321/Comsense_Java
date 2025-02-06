package TBC.Exception.Funds;
import java.util.Scanner;
public class Funds {
	static double balance=5000;

	static void withdraw(double amount)throws InsufficientFundsException{
		if(amount>balance){
			throw new InsufficientFundsException("Insufficient balance ");
		}
		balance=balance-amount;
		System.out.println("Withdrawal successful! Remaining balance: " + balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter the value amount ");
			double amount=sc.nextDouble();
			withdraw(amount);
			
		}catch(InsufficientFundsException e){
			System.out.println("error:"+e.getMessage());
		}
	}

}
