package java1;

public class EqualsRefDemo2 {

	public static void main(String[] args) {

		Mobile2 m1 = new Mobile2("iphone1", "Apple", "1 December");
		Mobile2 m2 = new Mobile2("iphone2", "Apple", "2 December");
		Mobile2 m3 = new Mobile2("iphone3", "Apple", "3 December");

		System.out.println("*********print m1 values");
		System.out.println(m1.name + " " + m1.brand + " " + m1.date);
	
		System.out.println("***********print m2 values");
		System.out.println(m2.name + " " + m2.brand + " " + m2.date);
		
		System.out.println("**********print m3 values");
		System.out.println(m3.name + " " + m3.brand + " " + m3.date);
		
	}
}

class Mobile2 {
	public String name;
	String brand;
	String date;

	public Mobile2(String name, String brand, String date) {
		this.name = name;
		this.brand = brand;
		this.date = date;
	}
	

}
