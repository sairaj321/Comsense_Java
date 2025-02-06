package TBC.Speed;

public class Main {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.speedUp();
		System.out.println(v.getSpeed());
		v.speedUp();
		System.out.println(v.getSpeed());
		
		v=new Car();
		v.speedUp();
		System.out.println(v.getSpeed());
		v.speedUp();
		System.out.println(v.getSpeed());
		
		v=new Bicycle();
		v.speedUp();
		System.out.println(v.getSpeed());
		v.speedUp();
		System.out.println(v.getSpeed());


	}

}
