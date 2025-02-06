package TBC.Interface.MultipleInterface;

public class Display implements Printable,Showable{

	public void print(){
		System.out.println(" calling the Printable interface and print method ");
	}
	
	public void show(){
		System.out.println(" calling the showable interface and Show method ");
	}
	
	
	public static void main(String p[]){
		Printable obj=new Display();
		System.out.println("We can implement multiple interface");
		System.out.println("----------------------------------");
		obj.print();
		
		Showable obj2=new Display();
		obj2.show();
	}
}
