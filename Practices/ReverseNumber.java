package Practices;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reverse");
		int n=sc.nextInt();
		
		while(n>0){
			int num=n%10;
			System.out.print(num);
			n/=10;
		}
	}

}
