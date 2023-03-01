package Genericss;

import java.util.ArrayList;

public class College<T> implements CollegeOperations<T> {

	ArrayList<T> list = new ArrayList<>();

	@Override
	public void getStudentNames(T element) {
		// TODO Auto-generated method stub
		list.add(element);
	}

	@Override
	public String toString() {
		return "College [list=" + list + "]";
	}

	public T getelement(int element) {
		return list.get(element);

	}

}
