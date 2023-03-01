package Collectionss;

import java.util.ArrayDeque;
import java.util.Deque;

public class UsingDeque {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		// add elements to the Deque
		dq.offer("o");
		dq.offerFirst("b");
		dq.offerLast("a");
		System.out.println("deque:-" + dq);
		// access first elements

		String peekFirst = dq.peekFirst();
		System.out.println("First Element :-" + peekFirst);
		// access Last Element

		String peekLast = dq.peekLast();
		System.out.println("Lst Element :-" + peekLast);
		// remove first element
		String pollFirst = dq.pollFirst();
		System.out.println("Removed First Element: " + pollFirst);
		// remove Last element

		String pollLast = dq.pollLast();
		System.out.println("Removed Last Element: " + pollLast);
		// add element
		dq.push("aa");
		System.out.println(dq);

	}
}
