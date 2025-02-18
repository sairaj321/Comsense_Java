package Multitreading.Priority;

public class Test {

	public static void main(String[] args) {
		
		SetpPriority t1 = new SetpPriority("Low Priority Thread");
		SetpPriority t2 = new SetpPriority("Normal Priority Thread");
		SetpPriority t3 = new SetpPriority("High Priority Thread");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
