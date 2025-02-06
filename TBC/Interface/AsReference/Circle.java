package TBC.Interface.AsReference;
import java.util.Scanner;
public class Circle implements Shape{
	
	public void calculateArea(){
		
		Scanner sc=new Scanner(System.in);
		double pi=3.14;
		System.out.println("Enter the value of R :");
		int r=sc.nextInt();
		
		System.out.println("Area of circle is :"+pi*r*r);
	}
}
