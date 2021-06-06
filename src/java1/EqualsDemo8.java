package java1;

public class EqualsDemo8 {

	public static void main(String[] args) {

		String a = new String("Hello");
		String b = new String("Hello");

		if (a == b) {
			System.out.println("Same");
		} else {
			System.out.println("diff");
		}

		if (a.equals(b)) {
			System.out.println("same equals");
		} else {
			System.out.println("diff equals");
		}

	}
}
