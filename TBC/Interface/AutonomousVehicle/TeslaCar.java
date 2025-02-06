package TBC.Interface.AutonomousVehicle;

public class TeslaCar extends Vehicle implements SelfDriving,ElectricVehicle{

	public void navigate(){
		System.out.println("TeslaCar is navigating autonomously");
	}
	
	public void chargeBattery(){
		System.out.println("TeslaCar battery is charging");
	}
	
	public static void main(String p[]){
		TeslaCar obj=new TeslaCar();
		obj.drive();
		obj.navigate();
		obj.chargeBattery();
	}
}

