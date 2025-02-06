package TBC.Interface.PaymentSystem;

public class PayPalPayment implements Payment{
	
	public void pay(double amount){
		System.out.println("Paid " + amount + " using Paypal payment.");
	}
	public void refund(double amount){
		System.out.println("Refund "+amount+" using paypal payment");
	}
}
