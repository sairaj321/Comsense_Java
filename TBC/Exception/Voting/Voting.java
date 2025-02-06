package TBC.Exception.Voting;
import java.util.Scanner;
public class Voting {

	public static void validAge(int age){
		if(age<18){
			throw new IllegalArgumentException("You must be at least 18 years old to vote");
		}
		System.out.println("Age is valid, You can register to vote.");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		try{
			System.out.println("Enter your Age: ");
			int age=sc.nextInt();
			validAge(age);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

}
