package Collectionss;

import java.util.Stack;

public class UsingStack {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		// Add elements to Stack
		st.push("a");
		st.push("ae");
		st.push("aee");
		System.out.println("Stack elements: " + st);
		// Remove element from stack

		String remove = st.pop();
		System.out.println("Removed Element: " + remove);
		// Access element from the top
		String peek = st.peek();
		System.out.println("Element at top: " + peek);
		// Search an element
		int search = st.search("e");
		System.out.println("Position of e: " + search);

		// Check if stack is empty
		boolean result = st.empty();
		System.out.println("stack is empty:-" + result);

	}
}
