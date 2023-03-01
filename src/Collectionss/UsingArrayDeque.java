package Collectionss;

import java.util.ArrayDeque;
import java.util.Iterator;

public class UsingArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		// using add()
		ad.add("a");// 3
		// addFirst()
		ad.addFirst("G");// 2
		// addLast()
		ad.addLast("j");// 5
		// offer
		ad.offer("h");// 4
		// offerfirst
		ad.offerFirst("u");// 1
		//ad.offerFirst(null);//not allowed
		// offerLast
		ad.offerLast("k");// 6
		System.out.println("ArrayDeque: " + ad);

		// Get the first element
		String first = ad.getFirst();
		System.out.println("First Element: " + first);
		// Get the Last element
		String last = ad.getLast();
		System.out.println("Last Element :- " + last);
		// using peek
		String peek = ad.peek();
		System.out.println("Head Element: " + peek);
		// using peekfirst
		String peekFirst = ad.peekFirst();
		System.out.println("Fisrt Element " + peekFirst);
		// Using peekLast
		String peekLast = ad.peekLast();
		System.out.println("Last Element " + peekLast);

		Iterator<String> i = ad.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		Iterator<String> i1 = ad.descendingIterator();
		while (i1.hasNext()) {
			System.out.println("descendingOrder" + i1.next());
		}

		// Using remove
		String remove = ad.remove();

		System.out.println("Removed Element: " + remove);

		System.out.println("New ArrayDeque: " + ad);

		String removeFirst = ad.removeFirst();
		System.out.println("Remove First Element :-" + removeFirst);

		String removeLast = ad.removeLast();
		System.out.println("Remove First Element :-" + removeLast);

		String poll = ad.poll();
		System.out.println("Removed Element: " + poll);
		
		String pollFirst = ad.pollFirst();
		System.out.println("Removed Element: " + pollFirst);
		String polllast = ad.pollLast();
		System.out.println("Removed Element: " + polllast);

		System.out.println("New ArrayDeque: " + ad);

	}
}
