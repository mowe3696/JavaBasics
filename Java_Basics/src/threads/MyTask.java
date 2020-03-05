package threads;

public class MyTask {

	public static void main(String[] args) {
		Printer p = new Printer();
		MyThread t = new MyThread(p);
		Thread t1 = new Thread(t);
		// thread is executed by start() method
		t1.start();
		p.print();
		

	}

}
