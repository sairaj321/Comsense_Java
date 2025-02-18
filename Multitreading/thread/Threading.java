package Multitreading.thread;

public class Threading extends Thread{
	
	
		
		public void run(){
			System.out.println("hello that is thread");
		}
	

	public static void main(String[] args) {
	
		Threading th=new Threading();
		
		th.start();
		
		

	}

}
