
public class Stack {
	
	int index = 9;
	int stack[] = new int[10];
	
	public boolean isFull() {
		return index < 1;
	}
	
	public void insert(int value) {
		if(!isFull()) {
			stack[index] = value;
			index--;
		} 
		else { System.out.println("Stack is full");
		}
	}
	
	public void pop() {

		for (int i=8; i>0; i--) {
			stack[i+1] = stack[i];
			
		}index++;
	}
	
	public void display() {
		for(int i=0; i<stack.length; i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println("\nSize of Stack: " + (stack.length-index-1));
		System.out.println("Index:  " + index + "\n");
		//System.out.println(stack.length);
	}
	
	
}
		

