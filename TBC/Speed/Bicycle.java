package TBC.Speed;

public class Bicycle extends Car {
	int speed;
	Bicycle(){
		this.speed=0;
	}
	void speedUp() {
		this.speed+=10;
	}
	
	int getSpeed() {
		return this.speed;
	}

}
