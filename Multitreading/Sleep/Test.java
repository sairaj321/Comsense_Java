package Multitreading.Sleep;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Sleepping p1=new Sleepping();
		Sleeping2 p2=new Sleeping2();
		
		p1.start();
//		srp1.sleep(1000);
		
		p2.start();
		
		
		
	}

}
