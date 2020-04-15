package javabasics.queue;

public class Runner {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.show();
		q.deQueue();
//		q.deQueue();
//		q.deQueue();
//		q.deQueue();
//		q.enQueue(50);
//		q.enQueue(60);
//		q.enQueue(70);
//		q.enQueue(80);
//		q.enQueue(90);
		q.show();

	}

}
