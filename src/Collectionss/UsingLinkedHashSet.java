package Collectionss;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class UsingLinkedHashSet {
	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("A");
		lhs.add("B");
		lhs.add("F");
		lhs.add("C");
		lhs.add("C");// duplicates
		lhs.add("G");
		lhs.add("I");
		lhs.add(null);// allows null values
		lhs.add(null);// more than 1 is not allowed
		Iterator<String> i = lhs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// Using the remove() method
		boolean remove = lhs.remove("I");
		System.out.println("remove element :-" + remove);

	}

}
