package QuickTesting;

public class Runner {

	public static void main(String[] args) {
		QueueT q = new QueueT();
		q.enQueue(10);
		q.enQueue(12);
		q.enQueue(14);
		q.enQueue(16);
		q.enQueue(18);
		
		//q.display();
		
		q.deQueue();
		q.deQueue();
		q.deQueue();
		
		q.display();
		
		q.enQueue(20);
		q.enQueue(22);
		q.enQueue(24);
		q.display();

	}

}
