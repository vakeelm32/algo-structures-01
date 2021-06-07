package java1;

public class ImmuyableClassDemo4 {

	public static void main(String[] args) {

		ImmutableClass4 obj1 = new ImmutableClass4(10, "mubin");

		System.out.println("Age - " + obj1.getAge());
		System.out.println("Name - " + obj1.getName());

		ImmutableClass4 obj2 = new ImmutableClass4(11, "mubin");

		// abc134
		String a = "abc" + 1 + 3 + 4;
		System.out.println(a);

		// 6a2
		String b = 1 + 2 + 3 + "a" + 2 + 3 + 1;
		System.out.println(b);
	}
}

final class ImmutableClass4 {

	private final int age;
	private final String name;

	ImmutableClass4(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}
