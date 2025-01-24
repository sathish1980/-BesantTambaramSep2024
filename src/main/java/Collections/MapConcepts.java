package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapConcepts {
	
	//* MAP-->HashMap,LinkedHashMap,TreeMap
	
	// String[] names= {"name":"sathish","lname":"kumar","intial":"R","nextlastname":"kumar"};
	
	
	public void mapimplementation()
	{
		HashMap<String,String> Map = new HashMap<>();
		Map.put("name", "sathish");
		Map.put("age", "20");
		Map.put("quali", "b.tech");
		Map.put("name1", "kumar");
		System.out.println(Map);
		
		TreeMap<Integer,String> Map1 = new TreeMap<>();
		Map1.put(4, "sathish");
		Map1.put(2, "20");
		Map1.put(3, "b.tech");
		Map1.put(1, "kumar");
		Map1.put(1, "besant");
		System.out.println(Map1);
		
		System.out.println(Map1.keySet());
		System.out.println(Map1.values());
		System.out.println(Map1.entrySet());
		
		System.out.println(Map1.get(1));
		
		Map1.remove(3,"besant");
		System.out.println(Map1.keySet());
		
		Map1.replace(2, "30");
		System.out.println(Map1.entrySet());
		
		System.out.println(Map1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapConcepts M = new MapConcepts();
		M.mapimplementation();
	}

}
