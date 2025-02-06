package TBC.Interface.EmployeeManagment;
import java.util.Scanner;
public class Manager extends Person implements Employee{

	
	Manager(String name, int age){
		super(name,age);
	}
	public void getSalary(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic salary: ");
		double sal=sc.nextDouble();
		
		System.out.println("Total calculation of salary :"+(sal+sal*0.5));
	}
	
	
	
}
