package Genericss;

public class PersonMain {

	public static void main(String[] args) {
		Person<String, Integer> names = new Person<String, Integer>(); 
        names.putElement(01, "Anjali"); 
        names.putElement(02, "Gunduka"); 
        System.out.println("data is : " + names); 
 
        names.removeElement(02, "Gunduka"); 
        System.out.println("After removing : " + names); 
    } 

	}
	

