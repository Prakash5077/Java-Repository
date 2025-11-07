package oops;
import java.util.*;

public class Arraylist {
	
	public void aList() {
		
		// This is Interger type Arraylist
		/**ArrayList<Integer> values=new ArrayList<>();
		values.add(1);
		values.add(4);
		values.add(3); 
		
		
		// For each loop (one way)
		for(int i:values) {
			System.out.println(i);
		}
		
		// Iterator for looping (Another way)
		Iterator i=values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			**/
		
		ArrayList<String> S=new ArrayList<>();
		S.add("Luffy");
		S.add("Nami");
		S.add("Dragon");
		S.add(0,"Garp");
		System.out.println(S);
		S.set(0,"Roger");
		System.out.println(S);
		S.remove(1);
		System.out.println(S);
		S.add("Sanji");
		S.add("Brook");
		S.add("Fishmen");
		System.out.println(S);
		S.remove("Fishmen");
		System.out.println(S);
		S.add("Zoro");
		System.out.println(S.contains("Zoro"));
		System.out.println(S.indexOf("Zoro"));
		System.out.println(S.size());
		System.out.println(S.lastIndexOf("Zoro"));
		System.out.println(S.isEmpty());
    
		}
	}


 
