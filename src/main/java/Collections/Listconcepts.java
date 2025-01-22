package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listconcepts {
	
	String name = "sathish";
	String[] names= {"sathish","kumar","R","kumar"};
	/*
	 * List-->ArrayList, LinkedList,Stack (duplicate values)
	 * Set-->HashSet,LinkedHashSet,TreeSet
	 * MAP-->HashMap,LinkedHashMap,TreeMap
	 */
	
	public void listimplementation()
	{
		//List<String> AL = new ArrayList<>();
		//List<String> AL1 = new ArrayList<>();
		List<String> AL = new LinkedList<>();
		List<String> AL1 = new LinkedList<>();
		List<Integer> AL2 = new LinkedList<>();
		AL1.add("python");
		AL1.add("Java");
		/*
		 * 
		 */
		AL.add("apple");
		AL.add("orange");
		AL.add("mango");
		AL.add("apple");
		AL.addAll(AL1);
		//AL.addFirst("");
		
		System.out.println(AL);
		System.out.println("Sixe is : "+AL.size());
		
		for(String eachvalue : AL)
		{
			System.out.println(eachvalue);
		}
		
		for(int i=0; i<AL.size();i++)
		{
			System.out.println(AL.get(i));
		}
		
		AL.remove(4);
		//AL.removeLast();
		// AL.removeFirst();
		System.out.println(AL);
		
		AL.set(2, "Papaya");
		System.out.println(AL);
		
		System.out.println(AL.contains("Java"));
		AL.clear();
		System.out.println(AL);
		System.out.println(AL.isEmpty());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listconcepts L = new Listconcepts();
		L.listimplementation();
	}

}
