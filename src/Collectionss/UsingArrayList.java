package Collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import StringClasses.Student;

public class UsingArrayList {
	public static void main(String[] args) {

		Student s = new Student(1, "Anjali", "anjali@gmail.com", 1000);
		Student s1 = new Student(1, "Neha", "neha@gmail.com", 1000);
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		// Adding element
		System.out.println("add Student :-" + list);

		// list.remove(1);
		// System.out.println("remove Student"+list);
		// size of an ArrayList
		System.out.println("Students are :-" + list.size());
		// Retrieve the elements at a given index
		Student string1 = list.get(0);
		System.out.println("-----------------------");
		System.out.println("Student at index 1 is :-" + string1);
		System.out.println("Student at index 0 is :-" + list.get(0));

		// Enhanced for each loop
		System.out.println("-----------------------");
		for (Student c : list) {
			System.out.println("using for each loop" + c);
		}

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(12);
		list2.add(11);
		list2.add(10);
		list2.add(9);
		// How to modify an element at given index
		list2.set(0, 8);
		System.out.println("-----------------------");
		System.out.println("modify an element at given index :-" + list2);
		// Sorting the list
		Collections.sort(list2); // Asc order
		System.out.println("-----------------------");
		System.out.println("Ascending order " + list2);
		Collections.reverse(list2); // Desc order
		System.out.println("-----------------------");
		System.out.println("Descending order " + list2);
		Integer remove = list2.remove(1);
		System.out.println("removed " + remove);
		// clearing all
		list2.clear();
		System.out.println("After clearing all:- " + list2);
	}
}
