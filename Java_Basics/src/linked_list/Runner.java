package linked_list;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList x = new LinkedList();
		x.insert(1);
		//System.out.println(x.head.data);
		x.insert(2);
		//System.out.println(x.head.next.data);
		x.insert(3);
		// access third Node in linked list
		//System.out.println(x.head.next.next.data);
		
		//x.show();
		//x.insertAtStart(0);
		//x.show();
		x.insert(20);
		x.insertAt(4, 222);
		x.show();
		System.out.println("---");
		x.deleteAtIndex(0);
		x.show();
	}

}
