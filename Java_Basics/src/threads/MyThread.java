package threads;

public class MyThread implements Runnable{
	// reference to printer object
	Printer pRef;
	
	// initialize MyThread with printer object
	public MyThread(Printer p) {
		pRef = p;
	}
	// Override run() method of runnable interface
	@Override
	public void run() {

		pRef.print();
	}
}
