package QuestionPaper;

public class Employee1 {

	String name,designation;
	double salary;
	Employee1(String name,String designation,double salary)
	{
		
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		
	}

	void cal(){
		
		
		double HRA=salary*0.20;
		double DA=salary*0.5;
		double PF=salary*0.11;
		double Allow=1500;
		double Grass_Salary=salary+HRA+DA+Allow-PF;
		
		System.out.println("----------------------");
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Salary: "+Grass_Salary);
		System.out.println("----------------------");
		
	}
	
	
	
	
	public static void main(String p[]){
		Employee1 obj=new Employee1("sairaj","Salesforce dev",1000000);
		
		obj.cal();
		
	}
}
