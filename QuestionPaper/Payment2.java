package QuestionPaper;

public interface Payment2 {

	 void payAmount();
	 void showPaymentDetails();

}


 class CreditCardPayment implements Payment2{
	
	
	public void payAmount(){
		
		System.out.println("credit card payment pay amount");
	}
	
	public void showPaymentDetails(){
		
		System.out.println("Show the credit card payment details");
	}
}
 class UPIPayment implements Payment2{
	 
	 
	 public void payAmount(){
		 System.out.println("UPI payment pay amount ");
		 
	 }
	 public void showPaymentDetails(){
		 System.out.println("show the UPI payment details");
	 }
 }
 
 class Test{
	 public static void main(String p[]){
		 Payment2 obj=new CreditCardPayment();
		 
		 obj.payAmount();
		 obj.showPaymentDetails();
		 
		 obj=new UPIPayment();
		 obj.payAmount();
		 obj.showPaymentDetails();
	 }
 }
