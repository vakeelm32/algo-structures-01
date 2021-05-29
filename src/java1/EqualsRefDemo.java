package java1;

public class EqualsRefDemo {

	public static void main(String[] args) {
		Mobile m1 = new Mobile(10);
		Mobile m2 = new Mobile(100);

		System.out.println("m1 hashcode - " + m1.hashCode());

		System.out.println("m2 hashcode - " + m2.hashCode());

		if (m1 == m2) {
			System.out.println("same object");
		} else {
			System.out.println("not same");
		}

		m1 = m2;
		
		System.out.println("m1 hashcode - " + m1.hashCode());

		System.out.println("m2 hashcode - " + m2.hashCode());
		

		if (m1 == m2) {
			System.out.println("same object");
		} else {
			System.out.println("not same");
		}

		System.out.println("----------------");

	}
}

class Mobile {
	public int name;
	String brand;
	String date;

	public Mobile(int name) {
		this.name = name;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		return (this.name == ((Mobile) obj).name);
	}

}
