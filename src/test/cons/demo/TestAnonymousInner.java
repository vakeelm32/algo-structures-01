package test.cons.demo;

abstract class Person33 {
	abstract void eat();
}

class X extends Person33 {
	void eat() {
		System.out.println("X nice fruits");
	}

	void display() {

	}
}

public class TestAnonymousInner {
	public static void main(String args[]) {

		Person33 obj = new X();
		obj.eat();

		Person33 p = new Person33() {

			void display() {
				System.out.println("display'");
			}

			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
		//p.disp
	}
}
