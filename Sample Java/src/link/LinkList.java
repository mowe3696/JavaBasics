package link;

public class LinkList {

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
			
		}
			System.out.println(node.data);
	}
	
	public void insertAtIndex(int index, int i) {
		Node node = new Node();
		node.data = i;
		
		Node n1 = new Node();
		int counter = 0;
		n1 = head;
		//System.out.println("\n\n"+n1.next.next.data);
		while (counter<index-1) {
			n1 = n1.next;
			counter++;
		}
		node.next = n1.next;
		n1.next = node;
	}
}
