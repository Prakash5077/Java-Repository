package oops;

public class MotorBike {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void increaseSpeed(int howMuch) {
		this.speed+=howMuch;
	}
	public void decreaseSpeed(int howMuch) {
		this.speed-=howMuch;
	}
	
	

}
