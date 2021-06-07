package java1;

public class ImmuyableClassDemo {

	public static void main(String[] args) {

		// not immutable 
		ImmutableClass obj1 = new ImmutableClass(); // age =0, name=null

		obj1.age = 10;
		obj1.name = "imran";
		// age = 10 , name = imran

		obj1.age = 20;
		obj1.name = "aftab";
		// age = 20 , name = aftab

	}
}

class ImmutableClass {

	int age;
	String name;

}
