package java1;

public class ClassObjectDemo {

	public static void main(String[] args) {

		Person p =  new Person();
		System.out.println("Adhaar Number " + p.adharNumber);
		System.out.println("name "+ p.name);
		
		p.adharNumber = 100;
		p.name = "vakeel";
		
		System.out.println("Adhaar Number " + p.adharNumber);
		System.out.println("name "+ p.name);
		
		
		System.out.println("----------------");
		
		Person p2 =  new Person();
		System.out.println("Adhaar Number " + p2.adharNumber);
		System.out.println("name "+ p2.name);
		
	}
}

class Person {
	public String name;
	public int adharNumber;
}
