package TBC.Interface.PaymentSystem;

public class PaymentCall {

	public static void main(String[] args) {
		Payment pay1=new CreditCardPayment();
		System.out.println("...CreditCardPayment  method .... ");
		pay1.pay(500);
		pay1.refund(100);
		
		Payment pay2=new PayPalPayment();
		System.out.println("...PayPalPayment  method .... ");
		pay2.pay(400);
		pay2.refund(20);

	}

}
