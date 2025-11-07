package oops;

public class SynchronizedBlock {
	
	public void display() {
		synchronized(this) {
		
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
}
