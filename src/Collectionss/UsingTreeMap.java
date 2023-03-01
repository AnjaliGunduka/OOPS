package Collectionss;

import java.util.Map;
import java.util.TreeMap;

public class UsingTreeMap {

	
	public static void main(String[] args)
	{
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		 // Using put()
		tm.put("A", 1);
		tm.put("b", 2);
		tm.put("a", 3);
		 // Using putIfAbsent()
		tm.putIfAbsent("g", 2);
		System.out.println("updated Map"+tm);
		 // Using replace()
		Integer replace = tm.replace("b", 6);
		System.out.println("replce the element :-"+replace);
		//key 3 can be replaced as 33 return boolean value
		boolean replace2 = tm.replace("a", 3, 33);
		System.out.println("replce the element :-"+replace2);
		
		System.out.println("updated Map"+tm);

		for(Map.Entry m:tm.entrySet())
		{
			System.out.println(m);
		}
		
		
		
		
		
		
		
	}
}
