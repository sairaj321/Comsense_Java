package TBC.Interface.Basic;

public class VehicleCall {

	public static void main(String[] args) {
		Car obj1=new Car();
		System.out.println(".........Car calling..........");
		obj1.start();
		obj1.stop();
		obj1.fueltype();
		
		Bike obj2=new Bike();
		System.out.println("..........Bike calling.........");
		obj2.start();
		obj2.stop();
		obj2.fueltype();

	}

}
