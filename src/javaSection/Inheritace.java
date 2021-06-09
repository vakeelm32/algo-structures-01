  
package javaSection;
class Parent1 {
	public Parent1() {
		super();
		System.out.println("Parent Constrcutor");
	}

	public Parent1(String x) {
		System.out.println("Parent param Constrcutor");
	}

	public void display() {
		System.out.println("parent display");
	}
}

class Child1 extends Parent1 {
	int x = 10;

	public Child1() {
		this(10);
		System.out.println("Child Constructor");
	}

	public Child1(int x) {
		super("aftab");
		System.out.println("Child param Constructor");
	}

	public void show() {
		System.out.println("inside show");
	}
}

class GrandChild1 extends Child1 {
	public GrandChild1() {
		super.show();
		super.display();
		System.out.println("Grand Child Constructor");
	}
}

public class Inheritace {
	public static void main(String[] args) {
		GrandChild1 c = new GrandChild1();
	}

}