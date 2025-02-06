package Abstract;

abstract public class Demo {

	abstract void sum();
}

class Demo1 extends Demo{
	
	void sum(){
		System.out.println("Sum of two numbers");
	}
	
	
}

class Demo3{
	public static void main(String p[]){
		Demo a=new Demo1();
		a.sum();
	}
}
	

