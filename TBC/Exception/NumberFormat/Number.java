package TBC.Exception.NumberFormat;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Enter the name :");
		String str=sc.next();
		int num=Integer.parseInt(str);
		System.out.println("Valid number: " + num);
		}
		catch(NumberFormatException s){
			System.out.println("Error: Invalid number format.");
		}
	}

}
