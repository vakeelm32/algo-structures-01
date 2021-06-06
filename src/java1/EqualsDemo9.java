package java1;

public class EqualsDemo9 {

	public static void main(String[] args) {

		Person8 p1 = new Person8(10, 100);
		Person8 p2 = new Person8(10, 100);

		boolean isSame = p1.equals(p2);
		System.out.println(isSame);

	}
}

class Person8 {
	int age;
	int name;

	Person8(int age, int name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Person8 obj2 = (Person8) obj;

		if ((this.age == obj2.age) && (this.name == obj2.name)) {
			return true;
		} else {
			return false;
		}
	}

}
