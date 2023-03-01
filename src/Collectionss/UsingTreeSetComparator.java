package Collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import StringClasses.Student;

public class UsingTreeSetComparator {
	public static void main(String[] args) {

		TreeSet<Student> ts = new TreeSet<>(new ComparatorExample());

		Student s = new Student(1, "Neha", "anjali@gmail.com", 1000);
		Student s1 = new Student(1, "Anju", "anju@gmail.com", 1000);
		Student s2 = new Student(1, "Anjali", "anjali@gmail.com", 1000);

		ts.add(s2);
		ts.add(s1);
		ts.add(s);
		Iterator<Student> i = ts.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}

class ComparatorExample implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub

		return (o1.getName()).compareTo(o2.getName());
	}

}