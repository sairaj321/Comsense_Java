package TBC.Interface.multipleInheritance;

public class Duck implements Flyable, Swimmable{

	public void fly(){
		System.out.println("Flyable method ");
	}
	
	public void swim(){
		System.out.println("Swimmable method ");
	}
	
	
	public static void main(String p[]){
		
		Flyable obj1=new Duck();
		obj1.fly();
		
		Swimmable obj2=new Duck();
		obj2.swim();
	}
}
