package Bank;
import java.util.Scanner;
public class AccountDetails {

	 int accno;
	 double balance;
	 String name,bankname;
	 Scanner sc=new Scanner(System.in);
	 
	 void adduser(){
		 System.out.println("Create your New Bank Account");
		 System.out.println("Enter Bank Name : ");
		 bankname=sc.next();
		 System.out.println("Enter Account Holder Name : ");
		 name=sc.next();
		 System.out.println("Enter your Account number : ");
		 accno=sc.nextInt();
		 balance=5000;
		
		 
	 }
	 void viewuser(){
		 System.out.println("-------------------------------------------");
		 System.out.println("               "+bankname+"Bank     ");
		 System.out.println("-------------------------------------------");
		 System.out.println("Account Holder's Name : "+name);
		 System.out.println("Account Number        : "+accno);
		 System.out.println("Account Balance       : "+balance);
		 System.out.println("-------------------------------------------");
		 
	 }
	 void checkbalance(){
		 System.out.println("your corrent Balance :"+balance);
	 }
	
}
