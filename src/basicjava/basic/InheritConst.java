package basicjava.basic;

class Parent {
	// X,Y
	public Parent() {
		super();
		System.out.println("Parent Constrcutor");
	}
}

class Child extends Parent {
	// A , B
	public Child() {
		super();
		System.out.println("Child Constructor");
		show();
	}

	public void show() {
		System.out.println("inside show");
	}

}

// 
class GrandChild extends Child {
	// L,M
	public GrandChild() {
		// super();
		System.out.println("Grand Child Constructor");

	}
}

public class InheritConst {

	public static void main(String[] args) {
		GrandChild c = new GrandChild();
	}

}