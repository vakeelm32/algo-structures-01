package java1;

public class EqualsRefDemo4 {

	public static void main(String[] args) {

		Mobile212 m1 = new Mobile212("iphone1", "Apple", "1 December");
		Mobile212 m2 = new Mobile212("iphone2", "Apple", "2 December");
		Mobile212 m3 = new Mobile212("iphone3", "Apple", "3 December");

		
		// getClass().getName() + "@" + Integer.toHexString(hashCode());
		//String hexString = Integer.toHexString(m1.hashCode());
		//System.out.println(hexString);
		System.out.println(m1);
		
		System.out.println(m1.toString());
		
	}
}

class Mobile212 {
	public String name;
	String brand;
	String date;

	public Mobile212(String name, String brand, String date) {
		this.name = name;
		this.brand = brand;
		this.date = date;
	}
	@Override
	public String toString() {
		System.out.println("Hello I am inside the toString Method");
		return "Hello";
	}
}
