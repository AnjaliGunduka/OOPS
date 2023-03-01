package Collectionss;

import java.util.LinkedList;

public class UsingLinkedList {

	public static void main(String[] args) {
		LinkedList<String> s = new LinkedList<>();
		// by using add methods
		s.add("anju");
		s.add("anjali");
		// by using add(position, element) method
		s.add(1, "gunduka");
		// by using addFirst method
		s.addFirst("Gunduka");
		// by using addLast method
		s.addLast("anusha");

		System.out.println("list:-" + s);

		// clone List
		// Returns a shallow copy of this elements
		LinkedList<String> s1 = new LinkedList<>();
		s1 = (LinkedList) s.clone();
		System.out.println("list s1 :- " + s1);

		// getting first element by using getFirst()
		String firstElement = s1.getFirst();
		System.out.println("First element is :-" + firstElement);

		// getting last element by using getLast()
		String lastElement = s1.getLast();
		System.out.println("Last element is :-" + lastElement);

		String position = s1.get(3);
		System.out.println("position of the list:-" + position);
		// getting all the elements
		for (String s2 : s) {
			System.out.println("elements are:-" + s2);
		}
		// removing 1st element
		String removeFirst = s.removeFirst();
		System.out.println("remove first element:-" + removeFirst);

		// removing last element
		String removeLast = s.removeLast();
		System.out.println("remove last element" + removeLast);

		// removing specified element
		boolean remove = s.remove("anju");
		System.out.println("element removed" + remove);
		// using contains method

		boolean contains = s.contains("anjali");
		System.out.println("list contains:-" + contains);
		// finding index
		int indexOf = s.indexOf("anjali");
		System.out.println("index is:- " + indexOf);
		// finding last Index
		int lastIndexOf = s.lastIndexOf("anjali");
		System.out.println("last index is :- " + lastIndexOf);
		// peek method
		System.out.println("head of the List : " + s.peek());
		// peekFirst method
		System.out.println("First element of the list : " + s.peekFirst());
		// peekLast method
		System.out.println("Last element of the list : " + s.peekLast());
		// poll method
		System.out.println("Removed head element : " + s1.poll());
		// pollFirst method
		System.out.println("Removed First element : " + s1.pollFirst());
		// pollLast method
		System.out.println("Removed last element : " + s1.pollLast());
		System.out.println("Final list : " + s);

		// clearing all elements
		s.clear();
		System.out.println("Empty LinkedList " + s);

		// offer method
		s.offer("anju");
		// offerFirst method
		s.offerFirst("anjali");
		// offerLast method
		s.offerLast("Gunduka");

		System.out.println("after printing all the offer methods" + s);

	}
}
