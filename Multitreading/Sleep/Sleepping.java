package Multitreading.Sleep;

public class Sleepping extends Thread{

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("sleep 1 "+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
