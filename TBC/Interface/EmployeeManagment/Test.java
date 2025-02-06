package TBC.Interface.EmployeeManagment;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name=sc.next();
		System.out.println("Enter the Age: ");
		int age=sc.nextInt();
		
		Manager obj=new Manager(name,age);
		obj.displayDetails();
		obj.getSalary();
	}

}
