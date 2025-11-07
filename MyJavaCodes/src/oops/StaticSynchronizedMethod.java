package oops;

public class StaticSynchronizedMethod {
	
	public static synchronized void display() {
		Thread G=Thread.currentThread();
		for(int i=0;i<=5;i++) {
			try {
				G.sleep(1000);
			}
			catch(Exception e) {
				
			}
			System.out.println(G.getName()+" "+i);
		}
	}

}
