package oops;

public class This {
	int S=100;
	static int Z=200;
	
	void display() {
		int S=190;
		System.out.println(S);
		//System.out.println(this.S);
		//System.out.println(Z);
	}

}
