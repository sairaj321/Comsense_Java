package QuestionPaper;

class Even extends Thread{
	public void run(){
		
		for(int i=0;i<=20;i+=2){
			System.out.println("Even :"+i);
			try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
	
}
class Odd extends Thread{
	
	public void run(){
		for( int i=1;i<=20;i+=2){
			System.out.println("Odd : "+i);
			try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}




public class Threads4 {

	public static void main(String p[]){
	Even obj=new Even();
	Odd obj2=new Odd();
	obj.start();
	obj2.start();
	}
}
