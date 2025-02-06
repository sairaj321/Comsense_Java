package TBC.Abstract.Vehicle;

import java.util.Scanner;

public abstract class Vehicle {
 
	String Brand;
	int Speed;
	Scanner sc = new Scanner(System.in);
	
	//abstract method
	abstract void accelerate();
	
	//non-abstract method
	void showData() {
		System.out.println("Enter the Brand name:");
		Brand = sc.next();
		System.out.println("Enter The Top Speed Of Vehicle:");
		Speed = sc.nextInt();
		System.out.println("Vehicle_Brand:"+Brand);
		System.out.println("Top_Speed:"+Speed+" km/h");
	}
	
}
 
class Car extends Vehicle{
	
	void accelerate() {
		System.out.println("Current_Acceleration :"+(Speed+20));
	}
}
class Bike extends Vehicle{
	void accelerate() {
		System.out.println("Current_Acceleration :"+(Speed+10));
	}
}