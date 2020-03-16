package javabasics.generics;

public class Runner {

	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<>();
		GenericClass<Integer> i = new GenericClass<>();
		
		s.value = "hi";
		// won't work:
		//s.value = 100;
		
		i.value = 10;
		
		System.out.println(s.value);
		System.out.println(i.value);
	}

}
