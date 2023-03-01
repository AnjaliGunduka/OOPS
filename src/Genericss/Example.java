package Genericss;

import java.util.Iterator;
import java.util.LinkedList;


public class Example
{
	 public static void main(String[] args)
	 {
		 LinkedList<String> l=new LinkedList<>();
		 l.add("anjali");
		 System.out.println(l);
		 
		 Iterator<String> i=l.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
	 }
}