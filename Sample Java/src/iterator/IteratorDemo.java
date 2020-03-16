package iterator;

import java.util.*; 

// This is a demo on how to use Iterator

public class IteratorDemo{

	public static void main(String[] args) {
		// 1. Example with ArrayList<Integer>
		// create array list which you want to iterator over
		ArrayList<Integer> intList = new ArrayList<>();	
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		// Instantiate iterator on list
		Iterator<Integer> iIterator = intList.iterator();
		
		// iterate over each item in list
		while(iIterator.hasNext()) {
			System.out.println(iIterator.next());
		}
		
		// 2. Example with Set<String>
		// create set list 
		Set<String> set = new HashSet<>();
		set.add("5");
		set.add("6");
		set.add("7");
		
		// Instantiate iterator on list
		Iterator<String> sIterator = set.iterator();
		
		// iterate over each item in list
		while(sIterator.hasNext()) {
			System.out.println(sIterator.next());
		}
	}
}
