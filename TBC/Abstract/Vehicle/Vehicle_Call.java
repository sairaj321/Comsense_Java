package TBC.Abstract.Vehicle;

import java.util.Scanner;

public class Vehicle_Call {
	public static void main(String args[]) {
		int ch =0;
		Vehicle vh = new Car();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Car");
		System.out.println("2.Bike");
		System.out.println("Enter The choice:");
		ch = sc.nextInt();
		switch(ch) {
		case 1:	vh.showData();
				vh.accelerate();
				break;
		case 2:	vh = new Bike();
				vh.showData();
				vh.accelerate();
				break;
		default:System.out.println("Invalid Choice!!");
		}
		
		
		
	}
}