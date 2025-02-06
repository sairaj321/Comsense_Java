package TBC.Interface.SmartHome;

public class SmartSpeaker extends Device implements SmartDevice,voiceAssistant{

	public void connectToWifi(){
		System.out.println("Connect to Wifi ");
	}
	
	public void respondsToVoice(){
		System.out.println("responds to voice");
	}
	
	
	
	
}
