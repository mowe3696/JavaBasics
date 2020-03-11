package linked;

public class LinkedList {
	Node head;
	
	public void insertAtStart(int i) {
		Node node = new Node();
		node.data = i;
		node.next = head;
		head = node;
	}
	
	public void show() {
		Node node = new Node();
		node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		} System.out.println(node.data);
	}
	
	public void inserAtIndex(int index, int i) {
		Node node = new Node();
		node.data = i;
		
		// FIX THIS
		if(index == 0) {
			Node newN = new Node();
			newN = head;
			node.next = head;;
			
			head = newN;
		}
		
		Node n1 = head;
		for (int x=0; x<index-1; x++) {	
			n1 = n1.next;
		} 

		node.next = n1.next;
		n1.next = node;


	}
}
