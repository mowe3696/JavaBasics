package javabasics.linked;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtStart(30);
		list.insertAtStart(10);
		list.insertAtStart(20);
		list.show();
		System.out.println("....");
		list.inserAtIndex(2, 44);
		list.show();
		System.out.println("....");
		list.inserAtIndex(0, 22);
		list.show();
		
		
		
	}

}
