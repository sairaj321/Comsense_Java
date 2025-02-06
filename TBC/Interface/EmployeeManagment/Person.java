package TBC.Interface.EmployeeManagment;

public class Person {

	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void displayDetails(){
		System.out.println("=============================");
		System.out.println("  " +name);
		System.out.println("    "+age);
		System.out.println("==============================");
	}
}
