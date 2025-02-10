package Practices;

import java.util.Scanner;

public class Palindrome {

	public static boolean palin(String str){
		
		str=str.toLowerCase().replaceAll("[^a-z0-9]", "");
		int left=0;
		int right=str.length()-1;
		
		while(left<right){
			if(str.charAt(left)!=str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.next();
		
		System.out.println(palin(str));
	}

}
