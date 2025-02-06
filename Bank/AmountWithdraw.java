package Bank;

public class AmountWithdraw extends AmountDeposit{
	double withdraw;
	
	
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	void withdraw(){
		
		if((balance-withdraw)<5000){
			System.out.println("Insufficient balance and minimum balance is 5000 You cannot withdraw. ");
			
			}else{
				balance=balance-withdraw;
				System.out.println("amount "+withdraw+"is withdraw to your account And your current balance is :"+balance);
				
			}
		
		
		}
}
