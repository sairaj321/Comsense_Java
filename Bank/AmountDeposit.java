package Bank;

import java.util.Scanner;

public class AmountDeposit extends AccountDetails {
	double amount;

	public void setAmount(double amount) {
		this.amount = amount;
	}


	void deposit(){
		
			balance=balance+amount;
			System.out.println("Amount "+amount+"is deposited to your account And your current balance is :"+balance);
			
		
		
		
	}
}
