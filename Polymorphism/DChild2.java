package Polymorphism;

import java.util.Scanner;

public class DChild2 extends DChild1 {

	Scanner sc=new Scanner(System.in);
	void sum(){
		char a,b;
		System.out.println("---Child2 Sum in Char---");
		System.out.println("Enter the value of A :");
		a=sc.next().charAt(0);
		System.out.println("Enter the value of B :");
		b=sc.next().charAt(0);
		System.out.println("Sum of to number is  :"+(a+b));
	}
}
