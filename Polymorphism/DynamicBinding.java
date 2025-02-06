package Polymorphism;
import java.util.Scanner;

public class DynamicBinding extends DChild2{

	public static void main(String p[]){
		
		DParent obj=null;
		
		obj=new DParent();
		obj.sum();
		
		obj=new DChild1();
		obj.sum();
		
		obj=new DChild2();
		obj.sum();
		
	}
}
