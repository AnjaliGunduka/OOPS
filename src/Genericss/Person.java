package Genericss;

import java.util.HashMap;

public class Person<K,T> {
	HashMap<T,K> list=new HashMap<>();
	public void putElement(T element, K number) { 
        list.put(element, number); 
    } 
 
    public void removeElement(T element, K number) { 
        list.remove(element, number); 
    }

	@Override
	public String toString() {
		return "Person [list=" + list + "]";
	} 

    
    

}
