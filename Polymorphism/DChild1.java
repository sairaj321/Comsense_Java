package Polymorphism;

import java.util.Scanner;

public class DChild1 extends DParent{
	Scanner sc=new Scanner(System.in);
	void sum(){
		float a,b;
		System.out.println("---Child 1 Sum in float ---");
		System.out.println("Enter the value of A :");
		a=sc.nextFloat();
		System.out.println("Enter the value of B :");
		b=sc.nextFloat();
		System.out.println("Sum of to number is  :"+(a+b));
	}

}
