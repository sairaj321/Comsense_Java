package QuestionPaper;

public class Car extends Vehicle implements FuelConsumption{

	void move(){
		System.out.println("Car is moving at speed: km/hr");
	}
	
	public void calculateFuelEfficiency(){
		System.out.println("Car Fuel Efficiency  km/l");
	}
}
