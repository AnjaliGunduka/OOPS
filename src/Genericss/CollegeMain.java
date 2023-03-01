package Genericss;

public class CollegeMain {
	public static void main(String[] args) {
		College c = new College();
		c.getStudentNames("anju");
		c.getStudentNames(1);
		c.getelement(1);
		//System.out.println(c);
		College<String> c1 = new College();
		c1.getStudentNames("anjali");
       //c1.getStudentNames(1);

		College empArry[] = new College[2];
		empArry[0] = c;
		empArry[1] = c1;
		display(empArry);
		
		Integer[] array = { 1, 2, 3, 4, 5, 6 };
		display(array);

	}

	private static <E> void display(E[] element) {
		for (E e : element) {
			System.out.println(e);
		}
	}

}
