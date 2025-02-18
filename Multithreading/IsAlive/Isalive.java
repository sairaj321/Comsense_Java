package Multithreading.IsAlive;

public class Isalive extends Thread{

	public void run(){
		System.out.println("Thread running......");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Isalive t1=new Isalive();
		System.out.println("Before start: " + t1.isAlive());
		t1.start();
		System.out.println("After start: " + t1.isAlive());
	}

}
