package Collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import StringClasses.Student;

public class UsingArrayListComparator {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		Student s = new Student(1, "Anjali", "anjali@gmail.com", 1000);
		Student s1 = new Student(1, "Anju", "anju@gmail.com", 8000);
		Student s2 = new Student(1, "Anjali", "anjali@gmail.com", 6000);
		list.add(s);
		list.add(s1);
		list.add(s2);
		 Collections.sort(list, new SortingExample()); //Ascending order
		 
		 for(Student ss:list)
		 {
			 System.out.println(ss);
		 }

	}
}

class SortingExample implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		return o1.getMarks()-o2.getMarks();
	}
	
}






