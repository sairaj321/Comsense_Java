package TBC.Interface.OnlineBanking;
import java.util.Scanner;
public class BankAccount {

private long balance;
 Scanner sc=new Scanner(System.in);
	BankAccount(){

		this.balance=0;
	}
	void deposit() {

		System.out.print("Enter Amount to be Deposit:");

		long amt=sc.nextInt();

		balance+=amt;

		System.out.println("Amount Deposited..!"+"\n");

	}

	void withdraw() {

		System.out.print("Enter Amount to be Withdraw:");

		long amt=sc.nextInt();

		if(amt<=0) {

			System.out.println("Amount Cannot be zero or negative.....!"+"\n");

		}else if(balance-amt<0) {

			System.out.println("Insufficient Balance...!"+"\n");

		}else {

			balance-=amt;

			System.out.println("Amount Withdrawed..!"+"\n");

		}

	}

	

	long getBalance() {

		return this.balance;

	}
}
