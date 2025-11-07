package oops;

public class Super extends OverRide {
	
	void display() {
		int Y=89;
		System.out.println(Y);
		System.out.println("Current method");
		super.display();
		System.out.println(super.Y);
	}

}
