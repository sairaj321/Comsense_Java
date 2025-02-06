package Polymorphism;

public class Child extends Parent{

	void div(){
		System.out.println("---Child Sum---");
		int a,b;
		System.out.println("Enter the value of A :");
		a=sc.nextInt();
		System.out.println("Enter the value of B :");
		b=sc.nextInt();
		System.out.println("Div of to number is  :"+(a/b));
}
	void area(){
		int a,b;
		System.out.println("---Child Sum---");
		System.out.println("Enter the value of L :");
		a=sc.nextInt();
		System.out.println("Enter the value of B :");
		b=sc.nextInt();
		System.out.println("Area reactangle of two number is  :"+(a*b));
	}
}
