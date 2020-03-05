package linked_list;

public class LinkedList {
	// head note where linked list starts
	Node head;
	
	public void insert(int x) {
		
		// create new node 
		Node node = new Node();
		node.data = x;
		node.next = null;
		
		// check if node is the first one in the linked list
		// if yes:
		if(head==null) 
		{
			head=node;
		}
		// if no:
		// create temporary node n and set it to head
		// iterate over each node and check if it's the last one
		else 
		{
			Node n = head;
			while (n.next!=null) 
			{
				n = n.next;
			}
			// if last node is found set next reference to newly created node (Node node)
			n.next = node;
		}
	}
	
	public void show() {
		// create temporary node and set it to head node
		// iterate over each node and print value
		Node n = head;
		while (n.next!=null) {
			System.out.println(n.data);
			n = n.next;
		} 
		// print last nodes value
		System.out.println(n.data);
	}
	
	public void insertAtStart(int i) {
		
		Node node = new Node();
		node.data = i;
		node.next = head;
		head = node;
	}
	public void insertAt(int index, int j) {
		// create new node with data j
		Node node = new Node();
		node.data = j;
		node.next = null;
		
		// in case specified index is 0 and new node becomes head
		if(index == 0) {
			node.next = head;
			head = node;
		} else {
			
		
		// create temporary node for traveling through linked list starting with head
		Node n = head;
		
		// travel to not before specified index
		for (int i=0; i<index-1; i++) {
			n = n.next;
		}
		// let new node point to node on specified index
		node.next = n.next;
		// let node before index point to new node
		n.next = node;
		}
	}
	
	public void deleteAtIndex(int index) {
		// if specified index is 0
		if(index == 0) {
			head = head.next;

			//System.out.println("Index 0");
		} else {
		Node n = head;
		for (int i=0; i<index-1; i++) {
			n = n.next;
		}

		n.next = n.next.next;
		}
	}
	
}
