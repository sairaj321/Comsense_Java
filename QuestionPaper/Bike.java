package QuestionPaper;

public class Bike extends Vehicle implements  FuelConsumption{

void move(){
	 System.out.println("Bike is moving.");
	}
	
	public void calculateFuelEfficiency(){
		 System.out.println("Bike Fuel Efficiency km/l");
	}
}
