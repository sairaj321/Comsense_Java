package Practices;

import java.util.Scanner;

public class ConvertCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		
		StringBuilder convert=new StringBuilder();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			
			if(Character.isLowerCase(ch)){
				convert.append(Character.toUpperCase(ch));
			}else if(Character.isUpperCase(ch)){
				convert.append(Character.toLowerCase(ch));
				
			}else{
				convert.append(ch);
			}
		}
		
		System.out.println("that is vice versa String "+ convert.toString());
		
		
	}

}
