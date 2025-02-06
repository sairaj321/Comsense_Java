package Polymorphism;
import java.util.Scanner;
public class Parent {
	Scanner sc=new Scanner(System.in);
	void sum(){
		int a,b;
		System.out.println("---Parent Sum---");
		System.out.println("Enter the value of A :");
		a=sc.nextInt();
		System.out.println("Enter the value of B :");
		b=sc.nextInt();
		System.out.println("Sum of to number is  :"+(a+b));
}
	void area(){
		System.out.println("----Parent Area----");
		double pi=3.14;
		System.out.println("Enter the value of R :");
		int r=sc.nextInt();
		
		System.out.println("Area of circle is  :"+(pi*r*r));
	}
}
