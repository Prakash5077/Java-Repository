package oops;

import java.util.*;

public class Hashmap {
	public void hMap() {
	
	/**HashMap<String, String> map=new HashMap<>();
	map.put("Prakash","Developer");
	map.put("Luffy","King");
	map.put("Dragon","Monkey");
	
	System.out.println(map);
	System.out.println(map.get("Prakash"));
	
	Set<String> keys =map.keySet();
	
	for(String k:keys) {
		System.out.println("The keys are "+" "+ k+"     " +"The Values are "+" "+ map.get(k));
	}
	**/
	
	
	//System.out.println(map.get(1));
	//System.out.println(map.get(2));
		
	HashMap<String,Integer> map=new HashMap<>();
	map.put("Luffy", 500000000);
	map.put("Sanji", 300000000);
	map.put("Zoro", 40000000);
	map.put("Nami", 4555655);
	map.put("Brook", 40445454);
	map.put("Zimbe", 456247427);
	
	System.out.println(map);
	
	System.out.println(map.get("Luffy"));
	System.out.println(map.containsKey("Sanji"));
	System.out.println(map.containsValue(10));
	System.out.println(map.remove("zimbe",456247427));
	System.out.println(map.replace("Zoro", 40000000, 777777777));
	System.out.println(map.size());
	System.out.println(map.isEmpty());
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.remove("zimbe",456247427));
	System.out.println(map);
	
	
	
	
	
    
}
}
