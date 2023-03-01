package Collectionss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UsingMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("anjali", 1);
		map.put("anusha", 2);
		map.put("neha", 3);
		map.put("lalli", 4);
		map.put("preethi", 5);
		map.put("gunduka", 6);
		map.put("gunduka", 6);
		System.out.println("map" + map);
		// Access keys of the map
		System.out.println("key set of the map " + map.keySet());
		// Access values of the map
		System.out.println("values of the map " + map.values());
		// Access entries of the map
		System.out.println("entry set of the map " + map.entrySet());
		// Remove Elements from the map
		Integer remove = map.remove("anjali");
		System.out.println("remove elements " + remove);
		// replacing the elements
		Integer replace = map.replace("neha", 2);
		System.out.println("Replacing the elements " + replace);
		System.out.println("entry set of the map " + map.entrySet());
		// iterate the entryset elements in map
		Iterator<Entry<String, Integer>> i = map.entrySet().iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
         //using KeySet
			Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println("keySet Elemnts Iterator:- " + iterator.next());
		}

		
		
		
		
	}
}
