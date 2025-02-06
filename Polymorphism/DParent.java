package Polymorphism;

import java.util.Scanner;

public class DParent {
	Scanner sc=new Scanner(System.in);
	void sum(){
		int a,b;
		System.out.println("---Parent Sum in Integer---");
		System.out.println("Enter the value of A :");
		a=sc.nextInt();
		System.out.println("Enter the value of B :");
		b=sc.nextInt();
		System.out.println("Sum of to number is  :"+(a+b));
	}

}
