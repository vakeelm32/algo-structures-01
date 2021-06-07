package java1;

public class ImmuyableClassDemo2 {

	public static void main(String[] args) {

		// not immutable 
		ImmutableClass1 obj1 = new ImmutableClass1(); // age = 0, name = null
		
		// 1- we are not able to get the name and age for further processing 
		// 2 -  always new object will hold only default values
		

	}
}

class ImmutableClass1 {

	private int age;
	private String name;

}
