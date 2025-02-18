package QuestionPaper;

public class Vehicle5 {

	
	public static void main(String p[]){
		
		Vehicle car=new Car();
		car.move();
		((Car)car).calculateFuelEfficiency();
		
		Vehicle bike=new Bike();
		bike.move();
		((Bike)bike).calculateFuelEfficiency();
	}
}
