package javabasics.threads;

// This class defines the method which is supposed to run in a thread
class Printer{
	
	public void print() {
		for (int i=1; i<11; i++) {
			System.out.println("Document nr: " + i);
		}
	}
}

// This class implements runnable and overrides the run() method 
// Thread.start() looks for run() method..
class MyThread implements Runnable{
	//declare reference to Printer object
	Printer pRef;
	// MyThread is initialized with Printer object
	public MyThread(Printer p) {
		pRef = p;
	}
	// override run method to execute Printer.print()
	public void run(){
		pRef.print();
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Printer p =  new Printer();
		// Initialize MyThread with Printer object
		MyThread t = new MyThread(p);
		
		// if MyThread implements Runnable .. better solution
		Thread t1 = new Thread(t);
		t1.start();
		
		// if MyThread extends Thread.. but bad because you can't extend other class later on..
		//t.start();
		
		// printing from Printer object for comparison
		p.print();
		
	
		

	}

}
