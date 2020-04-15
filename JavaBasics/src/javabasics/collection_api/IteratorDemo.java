package javabasics.collection_api;
//Iterators are commonly use when you want to iterate through a collection
//some collections are indexed so for loops can be use
//other collections like Sets are not ordered -> iterators can be uses

import java.util.*;

public class IteratorDemo {
	
	// create list for demo
	static List<String> c = new ArrayList<>();
	
	public static void createList(List<String> c) {
		
		c.add("1");
		c.add("2");
		c.add("3");
	}

	public static void main(String[] args) {
		
		createList(c);
		
		// create iterator object of list and call iterator() method
		Iterator<String> i = c.iterator();
		
		// loop through each value of list
		// and use remove() to remove specific value out of list
		String str = "";
		
		while (i.hasNext()) {
			str = (String) i.next();
			if(str.equals("2")) {
				i.remove();
				System.out.println(" 2 removed");
				break;
			}
			
			
		} 
		System.out.println("Elements are: ");
		for (String string:c) {
			System.out.println(string);
		}

	}

}