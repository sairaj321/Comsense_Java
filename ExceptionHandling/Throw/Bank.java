package ExceptionHandling.Throw;

import java.util.Scanner;

public class Bank {

	
	void data() throws NumberNotcorrect{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary ");
		int sal=sc.nextInt();
		
		if(sal<0){
			throw new NumberNotcorrect("");
		}
		
		System.out.println("your salary"+sal);
	}
}
