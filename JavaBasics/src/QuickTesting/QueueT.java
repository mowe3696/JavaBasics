package QuickTesting;

public class QueueT {

	int front = 0;
	int rear = 0;
	int size = 0;
	
	int[] queue = new int[5];
	
	public int getSize() {
		return size;
	}
	
	public void enQueue(int value) {
		if(getSize()<5) {
			queue[rear] = value;
			rear = (rear+1)%5;
			size++;
			System.out.println(value + " added.");
		} else { System.out.println("Queue full!");}
	}
	
	public void deQueue() {
		if(getSize()>0) {
			System.out.println(queue[front] + " dequeued.");
			front = (front+1)%5;
			size--;
			
		} else { System.out.println("Queue empty!");}
	
	}
	
	public void display() {
		/*for(int i=0; i<queue.length; i++) {
			System.out.println(queue[i]);
		}
		*/
		System.out.println("----------------------");
		
		for(int i=0; i<size; i++) {
			System.out.println(queue[(front+i)%5]);
		}
		
	}
}
