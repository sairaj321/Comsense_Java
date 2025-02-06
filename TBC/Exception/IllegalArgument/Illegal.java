package TBC.Exception.IllegalArgument;
import java.util.Scanner;
public class Illegal {

	public static void validateAge(int age){
		if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Valid age: " + age);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		try{
			System.out.println("Enter the age: ");
			int age=sc.nextInt();
			validateAge(age);
		}catch(IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}
	}

}
