package TBC.Abstract.Bank;

import java.util.Scanner;
abstract class BankAccount
{
	Scanner sc=new Scanner(System.in);
	int accountNumber,balance=5000;
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	BankAccount()
	{
		System.out.println("Enter Account Number :");
		this.accountNumber=sc.nextInt();
	}
	
	void displayBalance()
	{
		
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account balance : "+balance);
	}
 
}
class SavingsAccount extends BankAccount
{
 
	@Override
	void deposit(double amount)
	{
		if(amount<0)
		{
			System.out.println("Amount must be greater than 0");
		}
		else
		{
			balance +=amount;
		}
	}
 
	@Override
	void withdraw(double amount)
	{
		if(balance-amount<1000 || amount<0)
		{
			System.out.println("Invalid amount.............");
		}
		else
		{
			balance-=amount;
		}
		
	}
	
}
class CurrentAccount extends BankAccount
{
 
	void deposit(double amount)
	{
		if(amount<0)
		{
			System.out.println("Amount must be greater than 0 ");
		}
		else
		{
			balance +=amount;
		}
	}
 
	@Override
	void withdraw(double amount)
	{
		if(amount<0 || balance-amount<0)
		{
			System.out.println("A\"Invalid amount.............");
		}
		else
		{
			balance -=amount;
		}
		
	}
}
 
public class Bank {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount b;
		int ch=0;
		do {
			System.out.println("Enter 1 for Savings Account");
			System.out.println("Enter 2 for Current Account");
			System.out.print("Enter Your Type of Account : ");
			ch=sc.nextInt();
			
			if(ch==1) {
				b=new SavingsAccount();
			}else if(ch==2) {
				b=new CurrentAccount();
			}else {
				b=null;
			}
			
		}while(ch!=1 && ch!=2);
		
		do{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Account Balance ");
			System.out.println("0.Exit");
			System.out.print("Enter Your Choice : ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter amount.........");
					int amount=sc.nextInt();
					b.deposit(amount);
					break;
				case 2:
					System.out.println("Enter amount.........");
					amount=sc.nextInt();
					b.withdraw(amount);
					break;
				case 3:b.displayBalance();
					break;
			}
		}while(ch!=0);
	}
 
}
 