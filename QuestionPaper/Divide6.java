package QuestionPaper;

import java.util.Scanner;

class Divide6{

	public int divide(int a,int b){
		
		int c=a/b;
		return c;
		
	}
	
	public static void main(String p[]){
		Scanner sc=new Scanner(System.in);
		Divide6 obj=new Divide6();
		try{
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter Secound number :");
		int b=sc.nextInt();
		System.out.println(obj.divide(a,b));
		}catch(ArithmeticException e){
			System.out.println("zero not divide");
		}
		
	}
}