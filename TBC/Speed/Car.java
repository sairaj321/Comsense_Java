package TBC.Speed;

public class Car extends Vehicle{
	int speed;
	Car(){
		this.speed=0;
	}
	
	void speedUp() {
		this.speed+=30;
	}
	
	int getSpeed() {
		return this.speed;
	}

}
