package TBC.Interface.HierarchicalInheritance;

public class Engineer implements Employee{

	public void work(){
		System.out.println(" Engineer can work ");
	}
	
	public void walk(){ 
		System.out.println(" Engineer can walk");
	}

	
	
	public static void main(String[] args) {
		
		Employee obj=new Engineer();
		obj.walk();
		obj.work();

	}

}
