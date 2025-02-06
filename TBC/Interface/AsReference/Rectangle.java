package TBC.Interface.AsReference;
import java.util.Scanner;
public class Rectangle implements Shape{
	
	public void calculateArea(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of Rectangle ");
		System.out.println("Enter the value of L : ");
		int l=sc.nextInt();
		System.out.println("Enter the value of B : ");
		int b=sc.nextInt();
		
		System.out.println("Area of Rectangle: "+l*b);
		
		
	}
}
