package Genericss;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student(1, "anju", 800);
		s.setBranch("Cse");// string value
		s.setId(1);// int value
		s.setName(s1);// object values
		System.out.println(s);
		System.out.println(s1);

	}

}
