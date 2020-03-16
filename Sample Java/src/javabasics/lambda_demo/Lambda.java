package javabasics.lambda_demo;

// imagine you want to implement and run a method 
// which is declared in an Interface
interface A{
	public void show(int i);
}

//Because you can't create an object of an interface you would 
//have to create another class which implements the method from A
//and then define that method

class B implements A {
	
	@Override
	public void show(int i) {
		System.out.print("showing method by object creation: " + 10);
	}
}

public class Lambda {
	
	public static void main(String[] args) {

	A obj = new B();
	obj.show(10);
	
	System.out.println("");
	
	A fobj = i -> System.out.println("showing lambda method: " + i);
	fobj.show(22);
	// use lambda expression instead:
	
	}
}
