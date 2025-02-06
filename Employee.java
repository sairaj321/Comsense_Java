import java.util.Scanner;
public class Employee {
	
	long contact,basicSalary,empId;
	String empname,department,Grade,compName,compAddress,designation;
	double HRA,DA,Allow=0,PF,Grass_Salary;
	
	Employee(){
		 this.compName="The Baap Company";
		 this.compAddress="paregaon, ahilayanagar,MH,IND";
	}
	void displayDetails(long basicSal,String grade,long empId,String empname,long contact,String designation,String department){
		
		HRA=basicSal*0.20;
		DA=basicSal*0.5;
		switch(grade){
		case "a":Allow=1700;
			break;
		case "b":Allow=1500;
			break;
		case "c":Allow=1300;
			break;
		default:System.out.println("Write correct Grade");
		}
	
		PF=basicSal*0.11;
		
		Grass_Salary=basicSal+HRA+DA+Allow-PF;
		
		System.out.println("--------------------------------------------");
		System.out.println("             "+compName+"        ");
		System.out.println("       "+compAddress+"      ");
		System.out.println("--------------------------------------------");
		System.out.println(empId+"          "+empname+"        ");
		System.out.println(contact+"       "+designation+" ,"+department+"        ");
		System.out.println("--------------------------------------------");
		System.out.println("Basic Salary : "+basicSal);
		System.out.println("Grade        : "+grade);
		System.out.println("HRA          : "+HRA);
		System.out.println("DA           : "+DA);
		System.out.println("Allow        : "+Allow);
		System.out.println("PF           : "+PF);
		System.out.println("--------------------------------------------");
		System.out.println("GROSS SALARY : "+Grass_Salary);
		System.out.println("--------------------------------------------");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee obj=new Employee();
		
		System.out.println("Enter the basic salary:");
		long basicSal=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Grade:");
		String grade=sc.nextLine();
		
		System.out.println("Enter the EMPID:");
		long empId=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the EMP Name:");
		String empname=sc.nextLine();
		
		System.out.println("Enter the department Name:");
		String department=sc.nextLine();
		
		System.out.println("Enter the designation Name:");
		String designation=sc.nextLine();
		
		System.out.println("Enter the Contact Number:");
		long contact=sc.nextLong();
		
		
		obj.displayDetails(basicSal,grade,empId,empname,contact,designation,department);
		
		
	}

}
