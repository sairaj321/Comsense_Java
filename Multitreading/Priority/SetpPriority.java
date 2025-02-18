package Multitreading.Priority;

public class SetpPriority extends Thread{
	public SetpPriority(String name)
	{
		super(name);
	}
	
	public void run(){
		for(int i=1;i<=3;i++){
			System.out.println(getName() + " - Priority: " + getPriority() + " - Count: " + i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
