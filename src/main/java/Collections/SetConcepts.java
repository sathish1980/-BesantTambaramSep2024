package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {
	
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
		Set<String> AL = new TreeSet<>();
		Set<String> AL1 = new TreeSet<>();
	
		AL1.add("python");
		AL1.add("Java");
		/*
		 * 
		 */
		AL.add("apple");
		AL.add("orange");
		AL.add("mango");
		AL.add("apple");
		AL.add("Apple");
		AL.addAll(AL1);
		
		//AL.addFirst("");
		
		System.out.println(AL);
		System.out.println("Sixe is : "+AL.size());
		
		for(String eachvalue : AL)
		{
			System.out.println(eachvalue);
		}
		
		Iterator it= AL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		AL.remove("Apple");
		//AL.removeLast();
		// AL.removeFirst();
		System.out.println(AL);
		
		//AL.set(2, "Papaya");
		System.out.println(AL);
		
		System.out.println(AL.contains("Java"));
		AL.clear();
		System.out.println(AL);
		System.out.println(AL.isEmpty());
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetConcepts s = new SetConcepts();
		s.listimplementation();
	}

}
