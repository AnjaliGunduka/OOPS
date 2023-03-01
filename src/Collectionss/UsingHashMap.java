package Collectionss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import StringClasses.Student;

import java.util.Set;

public class UsingHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		System.out.println("Initial HashMap: " + hashMap);
		hashMap.put(1, "anjali");
		hashMap.put(2, "Gunduka");
		hashMap.put(3, "anju");

		System.out.println("HashMap" + hashMap);
		// It will add values
		hashMap.putIfAbsent(6, "Anjuuu");
		System.out.println("add elements :-" + hashMap);

		// get() method to get value
		String value = hashMap.get(1);
		System.out.println("Value at index 1: " + value);

		// using keySet()
		System.out.println("Keys :-" + hashMap.keySet());
		// using values()
		System.out.println("Vlaues :-" + hashMap.values());
		// entryset
		System.out.println("Entryset" + hashMap.entrySet());

		// remove element associated with key 2
		String value1 = hashMap.remove(2);
		System.out.println("Removed value: " + value1);

		for (HashMap.Entry m : hashMap.entrySet()) {
			System.out.println("map :-" + m.getKey() + " " + m.getValue());
		}
		System.out.println("Updated HashMap: " + hashMap);
		HashMap<String, Student> st = new HashMap<String, Student>();
		Student s = new Student(1, "Neha", "anjali@gmail.com", 1000);
		Student s1 = new Student(1, "Anju", "anju@gmail.com", 1000);
		Student s2 = new Student(1, "Anjali", "anjali@gmail.com", 1000);
		st.put("Back Bencher", s2);
		st.put("Topper", s);
		st.put("Student", s1);

		System.out.println("List of students" + st);
	}
}
