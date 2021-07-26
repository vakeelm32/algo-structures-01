package Test;

public class Question8 {
	class A {
		void display(String a) {
			System.out.println(a);
		}

		void display(int a) {
			System.out.println(a);
		}
	}

	class B {
		public void main(String args[]) {
			A a = new A();
			a.display("hello");
		}
	}
}
