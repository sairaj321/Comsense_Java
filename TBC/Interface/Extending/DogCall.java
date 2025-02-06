package TBC.Interface.Extending;

public class DogCall {

	public static void main(String[] args) {
		 
		Animal obj=new Dog();
		System.out.println("calling that sound and Isfriend methods");
		obj.makeSound();
		
		DomesticAnimal obj2=new Dog();
		obj2.isFriendly();

	}

}
