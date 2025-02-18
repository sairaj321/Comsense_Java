package Multitreading.Sleep;

public class Sleeping2 extends Thread{

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("sleep 2 "+i);
		}
	}
}
