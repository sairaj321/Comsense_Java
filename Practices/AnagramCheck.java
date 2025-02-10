package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String number one : ");
		String str1=sc.next();
		
		System.out.println("enter the String number Secund:");
		String str2=sc.next();
		
		
		str1.toLowerCase();
		str2.toLowerCase();
		
		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(s1, s2)){
			System.out.println(" String is anagram");
		}else{
			System.out.println(" String is not anagram");
		}
		
		
	}

}
