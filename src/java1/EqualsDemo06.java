package java1;

public class EqualsDemo06 {

	public static void main(String[] args) {

		EqualsDemo06 obj1 = new EqualsDemo06();

		EqualsDemo06 obj2 = new EqualsDemo06();

		System.out.println("obj1 " + obj1.hashCode());

		System.out.println("obj2 " + obj2.hashCode());

		if (obj1 == obj2) {
			System.out.println("same ref");
		} else {
			System.out.println("diff ref");
		}

		obj1 = obj2;
		System.out.println("obj1 " + obj1.hashCode());

		System.out.println("obj2 " + obj2.hashCode());
		if (obj1 == obj2) {
			System.out.println("same ref");
		} else {
			System.out.println("diff ref");
		}
	}
}
