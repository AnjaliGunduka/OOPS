package Genericss;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedExample {
	public static void main(String[] args) { 
		//Lower Bounded Integer List 
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7); 
		 
		//Integer list object is being passed 
		System.out.println("First list : "+list1); 
		 
		//Number list 
		List<Number> list2 = Arrays.asList(4, 5, 6, 7); 
		List<Number> list3 = Arrays.asList(4.7, 5L, 6f, 7); 
		SuperClass(list3);
		//Integer list object is being passed 
		System.out.println("Second list : "+list2); 
		} 
		 

		// Lower bound Wildcard − ? super Type. 
	//which accepts all types super class of a particular type OR parent class 
		public static void SuperClass(List<? super Integer> list) { 
		System.out.println(list); 
		} 

}
