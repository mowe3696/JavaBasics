package queue;

public class Queue {
	
	int queue[] = new int[5];
	int front;
	int rear;
	int size;
	
	public int enQueue(int data) {
		
		if (getSize()<5) {
			
		
		queue[rear] = data;
		size++;
		rear = (rear+1)%5;
		} 
		else {
			System.out.println("Queue is full!");
		}
		return data;
	}
	
	public int deQueue() {
		
		int data = queue[front];
		if (getSize()>1) {
	
		front = (front+1)%5;
		size--;
		}
		else 
		{ 
			System.out.println("Queue is empty!");
		}
		return data;
	}
	
	public void show() {
		System.out.print("Front to Rear: \n");
		for (int i=0; i<5; i++) {
			System.out.print(queue[(front+i)%5] + " ");
		}
		System.out.println("\n\nIndex 0 to n");
		for (int n:queue) {
			System.out.print(n+" ");
		}
		System.out.println("\n\nSize: " + getSize());
	}
	public int getSize() {
		return size;
	}
}

