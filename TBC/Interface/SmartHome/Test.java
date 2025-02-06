package TBC.Interface.SmartHome;

public class Test {

	public static void main(String[] args) {
		
		
		
		SmartSpeaker obj=new SmartSpeaker();
		obj.powerOn();
		System.out.println("----smart device----");
		obj.connectToWifi();
		
		System.out.println("----Voice device----");
		obj.respondsToVoice();
		

	}

}
