package oops;

public class MultiThreading extends Thread{
	
	Synchronization1 S;
	
	MultiThreading(Synchronization1 S){
		this.S=S;
		
	}
	
	public void run() {
		S.display();
	}
	
	
	

}
