package java1;

public class EqualsRefDemo5 {

	public static void main(String[] args) {

		Mobile2122 m1 = new Mobile2122("iphone1", "Apple", "1 December");
		Mobile2122 m2 = new Mobile2122("iphone2", "Apple", "2 December");
		Mobile2122 m3 = new Mobile2122("iphone3", "Apple", "3 December");
		
		Mobile2122 m4 = new Mobile2122("", "", "3 December");

		System.out.println(m1.toString() +  " date : "+ m1.date) ;
		
		System.out.println(m2.toString());
		
		System.out.println(m3.toString());
		
		System.out.println(m4);
		
		String a = new String("Vakeel");
		System.out.println(a);
		
		
	}
}

class Mobile2122 {
	public String name;
	String brand;
	String date;

	public Mobile2122(String name, String brand, String date) {
		this.name = name;
		this.brand = brand;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mobile2122 [name=" + name + ", brand=" + brand + "]";
	}

	
	
}
