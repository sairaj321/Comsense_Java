class Parent{
	Parent(String str){
		System.out.println("Parent constructor");
		System.out.println("Paramater == "+str);
	}
}
class Child extends Parent{
	
	Child(){
		super("sairaj");
		System.out.println("child constructor");
	}
}

class SuperConstructor {

	public static void main(String[] args) {
		Child obj=new Child();
    
		
	}

}
