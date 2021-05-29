package java1;

public class EqualsRefDemo3 {

	public static void main(String[] args) {

		Mobile21 m1 = new Mobile21("iphone1", "Apple", "1 December");
		Mobile21 m2 = new Mobile21("iphone2", "Apple", "2 December");
		Mobile21 m3 = new Mobile21("iphone3", "Apple", "3 December");

		System.out.println("*********print m1 values");
		m1.printObjectParams();
	
		System.out.println("***********print m2 values");
		m2.printObjectParams();
		
		System.out.println("**********print m3 values");
		m3.printObjectParams();
	}
}

class Mobile21 {
	public String name;
	String brand;
	String date;

	public Mobile21(String name, String brand, String date) {
		this.name = name;
		this.brand = brand;
		this.date = date;
	}
	
	public void printObjectParams() {
		System.out.println(this.name + " " + this.brand + " " + this.date);
	}

}
