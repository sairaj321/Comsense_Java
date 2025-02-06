package TBC.Interface.OnlineBanking;

public class SavingAccount extends BankAccount implements InterestBearing{
	
	SavingAccount(){
		super();
	}

	public void calculateInterest() {

		System.out.println("Interest on Balance is : "+(this.getBalance()*0.08+"\n"));

	}}
