package oops;

public class AllThreadMethods extends Thread {
	
	public void run() {
	
	Thread U=currentThread();
	System.out.println(U.isAlive());
	for(int i=0;i<=5;i++) {
		
		try {
			U.sleep(1000);
		}
		catch(Exception e){
		}
		System.out.println(i);
		}
	}
	
}


