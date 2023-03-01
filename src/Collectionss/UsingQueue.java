package Collectionss;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("a");
		q.add("b");
		q.add("e");
		q.add("c");
		q.add("f");
		// offer elements to the Queue
		q.offer("k");
		q.offer("j");
		q.offer("m");
		System.out.println(q);

		String peek = q.peek();
		System.out.println("head:-" + peek);

		String poll = q.poll();
		System.out.println("head of the elemnts is removed :-" + poll);
		System.out.println("latest queue is"+q);

	}

}
