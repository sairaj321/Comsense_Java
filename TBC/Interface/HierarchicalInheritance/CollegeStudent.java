package TBC.Interface.HierarchicalInheritance;

public class CollegeStudent implements Student{

	
	public void walk(){
		System.out.println("Walk for college student");
		
	}
	
	public void study(){
		System.out.println("study for college Student");
	}
	public static void main(String[] args) {
		
		Student obj=new CollegeStudent();
		obj.walk();
		obj.study();

	}

}
