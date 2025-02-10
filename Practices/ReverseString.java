package Practices;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be reverse");
		String n=sc.next();

		String []str=n.split("");
		
		for(int i=n.length()-1;i>=0;i--){
			
			System.out.print(str[i]);
			
		}
	}

}
