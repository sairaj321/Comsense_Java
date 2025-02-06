package TBC.AnimalFamily;

public class AnimalFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion=new Lion();
		Animal tiger=new Tiger();
		Animal panther=new Panther();
		
		System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("Tiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("Panther:");
        panther.eat();
        panther.sound();
	}

}
