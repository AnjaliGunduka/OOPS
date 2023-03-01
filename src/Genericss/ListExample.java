package Genericss;

import java.util.ArrayList;

public class ListExample<T> {

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	public T getElement(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return "Example1 [list=" + list + "]";
	}

}
