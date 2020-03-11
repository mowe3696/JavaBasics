package link;

public class Runner {

	public static void main(String[] args) {
		LinkList l = new LinkList();
		l.insertAtStart(100);
		l.insertAtStart(200);
		l.insertAtStart(300);
		l.insertAtStart(400);
		l.insertAtStart(500);
		
		l.show();
		System.out.println("........");
		l.insertAtIndex(2, 77);
		
		l.show();
	}

}
