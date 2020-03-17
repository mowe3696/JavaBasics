package javabasics.enums;

enum A{
	MONDAY(12), TUESDAY(40), WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	int hours = 24;
	
	A(){
		
	}
	
	A(int hour){
		this.hours = hour;
	}
	
	public int minPerDay() {
		return hours*60;
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		
		System.out.println(A.MONDAY.minPerDay());
		System.out.println(A.TUESDAY.hours);
		System.out.println(A.WEDNESDAY.hours);
		
	}

}
