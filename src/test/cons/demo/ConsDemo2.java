package test.cons.demo;

public class ConsDemo2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2(10,"Banglore",123);

		System.out.println(p1.age + " "+ p1.city + " "+p1.rollNumber );
		Person2 p2 = new Person2(12,"Banglore2",124);

		System.out.println(p2.age + " "+ p2.city + " "+p2.rollNumber );
		
		Person2 p3 = new Person2(15,"Banglore3",125);
		System.out.println(p3.age + " "+ p3.city + " "+p3.rollNumber );
		//
		Person2 p4 = new Person2();
		
	}
}

class Person2 {

	int age;
	int rollNumber;
	String city;

	// invisible default constructor
	public Person2(int age, String city, int rollNumber) {
		this.age = age;
		this.city = city;
		this.rollNumber = rollNumber;
	} // it will remove default constructor
	
	public Person2() {
		
	}

}
