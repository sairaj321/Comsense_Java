package TBC.Exception.Custom;
import java.util.Scanner;
public class Custom {

	public static void validateAge(int age)throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("Age must be 18 or above.");
		}
		System.out.println("Age is valid. You can register to vote.");
	}
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		try{
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			validateAge(age);
		}catch(InvalidAgeException  e){
			System.out.println("Error: " + e.getMessage());
		}
	}

}
