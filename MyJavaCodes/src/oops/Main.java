package oops;

public class Main {
	/*void display() {
		System.out.println("display");
	}
	 public double display(double a) {

		 return a;
		 
	}
	public void display(int a,int b) {
		System.out.println("Two Parameter");
	}
	public void display(String V) {
		System.out.println("String Parameter");
		
	}
	void display(double r,int b) {
		System.out.println("Double paramter");
	}*/
	
	

	public static void main(String[] args) {
		/*MotorBike Honda=new MotorBike();
		MotorBike Suzuki=new MotorBike();
		
		Honda.setSpeed(40);
		Suzuki.setSpeed(60);
		
		System.out.println(Honda.getSpeed());
		System.out.println(Suzuki.getSpeed());
		
		Honda.decreaseSpeed(10);
		Suzuki.decreaseSpeed(10);
		
		System.out.println(Honda.getSpeed());
		System.out.println(Suzuki.getSpeed());
		
		Honda.increaseSpeed(100);
		Suzuki.increaseSpeed(100);
		
		System.out.println(Honda.getSpeed());
		System.out.println(Suzuki.getSpeed()); 
		
		Constructor C=new Constructor();
		Constructor C1=new Constructor(5,5);*/
		
		/*String s1=new String("Prakash");
		s1=s1.concat("Luffy");
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1); */
		
		
		/*StringBuffer str=new StringBuffer("Love");
		System.out.println(str);
		System.out.println(str.append(" Is God"));
		System.out.println(str);
		System.out.println(str.substring(3));
		System.out.println(str);
		System.out.println(str.subSequence(0, 4));
		System.out.println(str);
		System.out.println(str.delete(0, 4));
		System.out.println(str);
		System.out.println(str.reverse());
		System.out.println(str);
		System.out.println(str.replace(0, 3, "God"));
		System.out.println(str);*/
		
		/*Main m1=new Main();
		m1.display();
		System.out.println(m1.display(5.5));
		m1.display(10,20);
		m1.display("Prakash");
		m1.display(5.0,7); */
		
		/*Ride R=new Ride();
		R.display(); */
		
		/*Super S=new Super();
		S.display();*/
		
		/*System.out.println(StaticPlay.a);
		StaticPlay.display();*/
		
		/*System.out.println(This.Z);
		This T=new This();
		System.out.println(T.S);
		T.display();*/
		
		/*Super S=new Super();
		S.display();*/
		
		/*AbstractImplement A=new AbstractImplement();
		A.display();
		A.run();
		A.Bat(); */
		
		/*AB K=new AB();
		K.display();
		K.show();
		K.run();
		K.hat(); */
		
		/*DerrivedClass D= new DerrivedClass();
		System.out.println(D.X);
		System.out.println(D.H);
		D.display();
		D.Show(); */
		
		/*InterfaceConcept I = new InterfaceConcept();
		I.display();
		I.show();
		I.run();
		I.hat();
		I.face(); */
		
		/*TryCatch t=new TryCatch();
		t.display(); */
		
		/*SingleThread S=new SingleThread();
		S.start();*/
		
		/*ThreadInterface Y=new ThreadInterface();
		Thread T=new Thread(Y);
		T.start();*/
		
		/*AllThreadMethods A=new AllThreadMethods();
		
		System.out.println("Thread Name is " +A.getName());
		A.setName("Prakash");
		System.out.println("New Thread Name is "+A.getName());
		System.out.println("Current Thread Priority is "+A.getPriority());
		A.setPriority(7);
		System.out.println("New Priority is "+A.getPriority());
		A.start(); */
		
		
		/*AllThreadMethods A=new AllThreadMethods();
		AllThreadMethods B=new AllThreadMethods();
		A.start();
		B.start();*/
		
		//JOIN METHOD & isAlive Method
		
		/*AllThreadMethods A= new AllThreadMethods();
		AllThreadMethods B= new AllThreadMethods();
		A.start();
		//System.out.println(A.isAlive());
		try {
			A.join();
		}
		catch(Exception e) {
			
		}
		System.out.println(A.isAlive());
		B.start();*/
		
		//MultiThreading &  Synchronization (1st way)
		/*
	    Synchronization1 SY=new Synchronization1();
		MultiThreading M1=new MultiThreading(SY);
		MultiThreading M2=new MultiThreading(SY);
		MultiThreading M3=new MultiThreading(SY);
		M1.start();
		M2.start();
		M3.start();
		*/
		
		//Static Synchronized Method (2nd Way)
		/*
		MultiThreading2 M1=new MultiThreading2();
		MultiThreading2 M2=new MultiThreading2();
		MultiThreading2 M3=new MultiThreading2();
		M1.start();
		M2.start();
		M3.start();
		*/
		
		// SynchronizedBlock (3rd Way)
		/*
		SynchronizedBlock SB=new SynchronizedBlock();
		MultiThreading3 M1=new MultiThreading3(SB);
		MultiThreading3 M2=new MultiThreading3(SB);
		MultiThreading3 M3=new MultiThreading3(SB);
		M1.start();
		M2.start();
		M3.start();
		*/
		
		//Arraylist A=new Arraylist();
		//A.aList();
		
		Hashmap h=new Hashmap();
		h.hMap();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
