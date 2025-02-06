
class Display{
	int a;
	void dog(){
		a=100;
		System.out.println("Hii");
	}
}
class Display1 extends Display{
	void dog(){
		super.dog();
		int a=10;
		int c=a+super.a;
		System.out.println(c);
		System.out.println("bye");
	}
}
public class Super {
	
	public static void main(String[] args) {
		Display1 d=new Display1();
		d.dog();
		
	}

}
