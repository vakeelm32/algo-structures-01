package java1;

public class InstanceOfDemo1 {

	public static void main(String[] args) {

		XYX99 obj = new XYX99();
		if (obj instanceof Person99) {
			System.out.println("obj instanceof Person99");
		}
		if (obj instanceof Student) {
			System.out.println("obj instanceof Student");
		}
		if (obj instanceof Object) {
			System.out.println("obj instanceof Student");
		}


	}
}

class Person99 {

}

class Student extends Person99 {

}

class Employee extends Person99 {

}

class XYX99 extends Student {

}