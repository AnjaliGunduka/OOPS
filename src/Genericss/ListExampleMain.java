package Genericss;

public class ListExampleMain {

	public static void main(String[] args)
	{
		ListExample listExample=new ListExample();
		listExample.addElement("anjali");
		listExample.addElement(1);
		System.out.println(listExample);
		System.out.println("element at index 0 is " + listExample.getElement(0));
		//now we can add only strings
		ListExample<String> listExample1=new ListExample();
		listExample1.addElement("anjali");
		System.out.println(listExample1);
	
	}
}
