package Collectionss;

import java.util.Iterator;
import java.util.TreeSet;

public class UsingTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("a");
		ts.add("b");
		ts.add("e");
		ts.add("d");
		ts.add("c");
		ts.add("i");
		ts.add("i");// duplicates
		// ts.add(null);//null values
		// Ascending order
		Iterator<String> i = ts.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// traversing elements in descending order.
		Iterator<String> descendingIterator = ts.descendingIterator();
		while (descendingIterator.hasNext()) {
			System.out.println("traversing elements in descending order :-" + descendingIterator.next());

		}
		// first element

		String first = ts.first();
		System.out.println("first element :- " + first);
		// Last element
		String last = ts.last();
		System.out.println("last element :- " + last);
		// pollFirst
		System.out.println("delete the highest element :- " + ts.pollFirst());
		// pollLast
		System.out.println("delete the Lowest element :- " + ts.pollLast());
		// subSet
		System.out.println("subset of elements " + ts.subSet("c", "i"));
		// Using subSet() with specified boolean value
		System.out.println("Using subSet : " + ts.subSet("c", false, "i", true));
		// tailset
		System.out.println("tailset of elements" + ts.tailSet("c", true));
		// headSet
		System.out.println("headSet of elements :- " + ts.headSet("c"));
		// Using higher()
        System.out.println("Using higher: " + ts.higher(first));

        // Using lower()
        System.out.println("Using lower: " + ts.lower(last));

        // Using floor()
        System.out.println("Using floor: " + ts.floor("i"));
		//using ceiling
        System.out.println("ceiling :- "+ts.ceiling("b"));
		
		
		
		System.out.println(ts);
	}
}
