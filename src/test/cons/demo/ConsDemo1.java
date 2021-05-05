package test.cons.demo;

public class ConsDemo1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 10;
		p1.city = "Banglore";
		p1.rollNumber = 123;
		// p1.
		// p1.
		//
		Person p2 = new Person();
		p2.age = 12;
		p2.city = "Banglore2";
		p2.rollNumber = 124;
		
		
		Person p3 = new Person();
		p3.age = 15;
		p3.city = "Banglore3";
		p3.rollNumber = 125;
		

	}
}

class Person {

	int age;
	int rollNumber;
	String city;
	
	public Person() {
		System.out.println("Hello Default const");
	}

}
