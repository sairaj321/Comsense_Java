package TBC.Interface.SmartDevice;

public class SmartPhone implements SmartDevice{

	
	public void powerOn(){
		System.out.println("Device Power On method");
	}
	 
	public void connectToInternet(){
		System.out.println("Connect to internet method");
	}
	public static void main(String[] args) {
		
		SmartDevice obj=new SmartPhone();
		obj.powerOn();
		obj.connectToInternet();

	}

}
