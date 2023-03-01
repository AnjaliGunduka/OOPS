package Collectionss;

import java.util.HashSet;
import java.util.Iterator;

public class UsingHashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		// Adding elements to the HashSet
		hashSet.add("anjali");
		hashSet.add("anu");
		// Addition of duplicate elements
		hashSet.add("anu");
		// Addition of null values
		hashSet.add(null);
		hashSet.add(null);
		System.out.println("HashSet elements : " + hashSet);

		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// Using remove() method
		boolean value1 = hashSet.remove("Anjali");
		System.out.println("Is Anjali removed? " + value1);

		// using the remove all method
		boolean value2 = hashSet.removeAll(hashSet);
		System.out.println("Removing all the elements " + value2);

	}

}
