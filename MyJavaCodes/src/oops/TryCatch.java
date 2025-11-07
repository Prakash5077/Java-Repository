package oops;
import java.lang.*;
public class TryCatch {
	void display() {
		try {
			int a=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		try {
			int b[]=new int[5];
			b[6]=20;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("Exception Handled");
		
	}

}
