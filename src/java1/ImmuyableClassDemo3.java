package java1;

public class ImmuyableClassDemo3 {

	public static void main(String[] args) {

		
		ImmutableClass3 obj1 = new ImmutableClass3(); // age = 0, name = null
		
		obj1.setAge(10);
		obj1.setName("mubin");
		// 
		
		obj1.setAge(12);
		obj1.setName("mubin2");
		// 

	}
}

class ImmutableClass3 {

	private int age;
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
