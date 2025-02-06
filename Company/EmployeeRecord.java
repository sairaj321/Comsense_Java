package Company;
import java.util.Scanner;

public class EmployeeRecord {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("*SELECT EMPLOYEE TYPE*");
		System.out.println("            1 => PERMANENT");
		System.out.println("            2 => TEMPORARY");
		System.out.println("");
		System.out.println("Enter your choice...");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			PermanantEmployee pe1=new PermanantEmployee();
			System.out.println("Enter Employee ID");
			pe1.setEmpId(sc.nextLong());
			System.out.println("Enter Employee Name");
			sc.nextLine();
			pe1.setEmpName(sc.nextLine());
			System.out.println("Enter Employee Contact Number");
			pe1.setEmpContact(sc.nextLine());
			System.out.println("Enter Employee Department");
			pe1.setDepartment(sc.nextLine());
			System.out.println("Enter Employee DEsignation");
			pe1.setDesignation(sc.nextLine());
			System.out.println("Enter Employee BasicSalary");
			pe1.setBasicSalary(sc.nextDouble());
			System.out.println("Enter Employee Grade");
			sc.nextLine();
			pe1.setGrade(sc.nextLine());
			
			while(true)
			{
				int ch;
				System.out.println("************ MENU ***************");
				System.out.println("        1=>get Employee Data..");
				System.out.println("        2=>get Salary Slip..");
				System.out.println("        3=>Exit..");
				System.out.println("*");
				System.out.println("Enter Your Choice..");
				ch=sc.nextInt();
				
				switch(ch)
				{
				case 1:
					pe1.getData();
					break;
				case 2:
					pe1.Calculate();
					pe1.printSalarySlip();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Enter Correct choice.....");
				}
			}
			
		case 2:
			TemporaryEmployee te1=new TemporaryEmployee();
			System.out.println("Enter Employee Name");
			sc.nextLine();
			te1.setEmpName(sc.nextLine());
			System.out.println("Enter Employee Contact Number");
			te1.setEmpContact(sc.nextLine());
			System.out.println("Enter Employee Department");
			te1.setDepartment(sc.nextLine());
			System.out.println("Enter Daily Wages");
			te1.setWagePerDay(sc.nextDouble());
			System.out.println("Enter Present Days");
			te1.setPresentDays(sc.nextInt());
			while(true)
			{
				int ch;
				System.out.println("************ MENU ***************");
				System.out.println("        1=>get Employee Data..");
				System.out.println("        2=>get Salary Slip..");
				System.out.println("        3=>Exit..");
				System.out.println("*");
				System.out.println("Enter Your Choice..");
				ch=sc.nextInt();
				
				switch(ch)
				{
				case 1:
					te1.getData();
					break;
				case 2:
					te1.printSalarySlip();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Enter Correct choice.....");
				}
			}
			
		default :
			System.out.println("please enter correct choice");
		}
	}
}