package java1;

public class InstanceOfDemo6 {

	public static void main(String args[]) {

		TP testObj = TestCasting.test();
		
		TestCasting obj = (TestCasting)testObj;
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}

class TP {

}
class TestCasting extends TP {
	public String name;
	public int age;

	public static TP test() {
		TestCasting obj = new TestCasting();
		obj.name = "TESTING123";
		obj.age = 100;
		return obj;
	}
}

