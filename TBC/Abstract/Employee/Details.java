package TBC.Abstract.Employee;

public class Details {
	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Employee e=new PartTimeEmployee("ksad","12",20000);
			e.display();
			e.calculateBonus();
			e=new FullTimeEmployee("asdas","1234",400000);
			e.display();
			e.calculateBonus();
	}
 
}