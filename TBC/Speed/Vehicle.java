package TBC.Speed;

public class Vehicle {
int speed;
	
	Vehicle(){
		this.speed=0;
	}
	
	void speedUp() {
		this.speed+=50;
	}
	
	int getSpeed() {
		return this.speed;
	}

}
