import java.util.*;


public class HashMaps {

	public static void main(String[] args) {

		HashMap<String,Integer> mp = new HashMap<>();
		
		//insert a key value pair in map;
		
		mp.put("India", 2);
		mp.put("Nepal", 1);
		mp.put("US", 2);
		
		System.out.println(mp.containsKey("India"));
		
		//iteration methods;
		
		// Print keys
		for (String i : mp.keySet()) {
		  System.out.println(i);
		}
		
		// Print values
		for (Integer i : mp.values()) {
			  System.out.println(i);
		}
		
		for(String key:mp.keySet()) {
			System.out.println("key : "+key+"; value: "+mp.get(key));
		}
		
		mp.remove("US");
		
		for(Map.Entry<String,Integer> e : mp.entrySet()) {
			System.out.println("key : "+e.getKey()+"; value: "+e.getValue());
		}

		
	}

}
