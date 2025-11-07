package oops;

public class MultiThreading3 extends Thread {
	
	SynchronizedBlock S;
	MultiThreading3(SynchronizedBlock S){
		this.S=S;
	}
	public void run() {
		
		S.display();
		
		
	}

}
