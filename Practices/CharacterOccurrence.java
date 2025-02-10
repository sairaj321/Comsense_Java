package Practices;

import java.util.Scanner;

public class CharacterOccurrence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String : ");
		String str=sc.next();
		
		System.out.println("enter which word we have search:");
		char ch=sc.next().charAt(0);
		
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				count++;
				
			}
		}
		System.out.println("The character "+ch+" appears "+count+" times in the string.");
	}

}
