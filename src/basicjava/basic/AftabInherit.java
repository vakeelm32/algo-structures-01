package basicjava.basic;

class Parent13 {
	public Parent13() {
		super();
		System.out.println("Parent Constrcutor");
	}
	public Parent13(String x) {
		System.out.println("Parent param Constrcutor");
	}
	public void display() {
		System.out.println("parent display");
	}
}
class Child13 extends Parent13 {
	int x = 10;
	public Child13() {
		this(10);
		System.out.println("Child Constructor");
	}
	public Child13(int x) {
		// super()
		super("aftab");
		System.out.println("Child param Constructor");
	}
	public void show() {
		System.out.println("inside show");
	}
}
class GrandChild13 extends Child13 {
	public GrandChild13() {
		super.show();
		super.display();
		System.out.println("Grand Child Constructor");
	}
}
public class AftabInherit {
	public static void main(String[] args) {
		GrandChild13 c = new GrandChild13();
	}

}
