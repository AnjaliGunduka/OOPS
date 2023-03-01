package Collectionss;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class UsingVector {

	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		// Using the add() method
		list.addElement("anjali");
		list.addElement("anusha");
		// Using index number
		// will be added before index 1
		list.add(1, "gunduka");
		System.out.println("List :-" + list);
		// Using addAll()
		Vector<String> list1 = new Vector<String>();
		list1.add("Anjuu");
		// added two lists into one list
		list1.addAll(list);
		System.out.println("New List :-" + list1);
		// Using get()
		String position = list.get(1);
		System.out.println("index is at position :-" + position);

		// The method subList(int fromIndex, int toIndex)
		List<String> subList = list.subList(1, 3);
		for (int j = 0; j < subList.size(); j++) {
			System.out.println("subLists are :-" + subList.get(j));

		}
		// Using iterator()
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println("Using iterator" + i.next());
		}
		// Using remove()
		String element = list.remove(1);
		System.out.println("Removed Element: " + element);
		System.out.println("New main List: " + list);

		// finding capacity of vector
		System.out.println("Capacity of vector is :" + list.capacity());

		// finding hashcode
		System.out.println("Hash code is " + list.hashCode());

		// inserting element
		list.insertElementAt("Gunduka", 1);
		System.out.println("After insertion :" + list);

		// Using clear()
		list.clear();
		System.out.println("main list after clear: " + list);

	}
}
