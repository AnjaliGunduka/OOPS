package Collectionss;

import java.util.Iterator;
import java.util.PriorityQueue;

public class UsingPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("a");
		pq.add("b");
		pq.add("e");
		pq.add("e");//Allows duplicates
		pq.add("c");
		pq.add("f");
		pq.add("g");
		//pq.add(null);
		// Using the offer() method
		pq.offer("f");
		System.out.println("head:"+pq.element());  
		System.out.println("update the list of elemets" + pq);
		// Using the peek() method
		String peek = pq.peek();
		System.out.println("head: " + peek);

		// Using the poll() method
		String poll = pq.poll();
		System.out.println("delete the head Element :-" + poll);
		Iterator<String> i = pq.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
