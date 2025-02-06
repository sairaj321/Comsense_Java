package TBC.Interface.PaymentSystem;

public class CreditCardPayment implements Payment {

	public void pay(double amount){
		System.out.println("Paid " + amount + " using Credit Card.");
	}
	public void refund(double amount){
		System.out.println("Refund "+amount+" using credit card");
	}
}
