package Collectionss;

import java.util.LinkedHashMap;

public class UsingLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		// put() method
		lhm.put("a", 1);
		lhm.put("f", 2);
		lhm.put("c", 3);
		System.out.println("Original LinkedHashMap: " + lhm);
		lhm.putIfAbsent("b", 2);
		System.out.println("Updated LinkedHashMap():" + lhm);

		LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<>();
		lhm1.put("Hello", 6);
		// Using putAll()
		lhm1.putAll(lhm);
		System.out.println("New LinkedHashMap: " + lhm1);

		// defaultValue if this map contains for the key.
		Integer orDefault = lhm.getOrDefault("f", 2);
		System.out.println("Returned Number: " + orDefault);
		
		//using entryset
		System.out.println("Key/Value mappings: "+lhm.entrySet());
		//keySet
		
		System.out.println("Keys: "+lhm.keySet());
		//values
		System.out.println("values"+lhm.values());
		
		// remove method with single parameter
        int value = lhm.remove("a");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = lhm.remove("c", 3);
        System.out.println("Removed EntrySet " + result);

        System.out.println("Updated LinkedHashMap: " + lhm);
		
		

	}
}
