package Bank;
import java.util.Scanner;
public class Backing extends AmountWithdraw{

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	AmountWithdraw aw=new AmountWithdraw();
	aw.adduser();
	aw.viewuser();
	
	while(true){
	System.out.println("!......Welcome to Banking.....!");
	System.out.println("1. Deposit ");
	System.out.println("2. Withdraw  ");
	System.out.println("3. Check Balance  ");
	System.out.println("4. Exit");
	System.out.println("Enter your choise :");
	int input=sc.nextInt();
	
	
		switch(input){
		case 1:
			System.out.println("Enter amount to deposit...");
			double amount=sc.nextDouble();
			if(amount<0||amount==0){
				System.out.println("Enter Valid amount ");
			}
			aw.setAmount(amount);
			aw.deposit();
				break;
		case 2:System.out.println("Enter amount to be Withdraw in your Account...");
				double withdraw=sc.nextDouble();
				aw.setWithdraw(withdraw);
				aw.withdraw();
				break;
		case 3:aw.checkbalance();
				break;
		case 4:System.exit(0);
			break;
		default:System.out.println("Write correct choice");
		}
	}
		
	}

}
