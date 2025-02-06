package TBC.Interface.AsReference;

public class ShapeCall {

	public static void main(String[] args) {
		
		Shape obj1=new Circle();
		System.out.println("Calling Circle of Area");
		obj1.calculateArea();
		
		Shape obj2=new Rectangle();
		System.out.println("Calling Rectangle of Area");
		obj2.calculateArea();
		
		

	}

}
