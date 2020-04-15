package javabasics.collection_api;

import java.util.*;


public class ListDemo {
	
	// use if possible the smallest possible type .. Collection instead of LinkedList
	// this way it's easier to change data structures later on
	public static void fill(Collection<String> c) {
		c.add("4");
		c.add("2");
		c.add("3");
	}

	public static void main(String[] args) {
		
		// List implements Collection which offers many useful methods like add(), equals(), get()
		// us List instead of LinkedList
		List<String> c = new LinkedList<String>();
		fill(c);
		
		System.out.println(c);
		
		// "CollectionS" is a utility class (not mistaken with "Collection" interface
		Collections.sort(c);
		
		System.out.println(c);
		
		// advanced for loop
		for(String s:c) {
			System.out.print(s);
		} System.out.println("");

	}

}