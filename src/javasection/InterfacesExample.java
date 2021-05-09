package javasection;

interface Test {
	void meth1();

	void meth2();
}

class My implements Test {
	public void meth1() {
		System.out.println("Meth1 of class My");
	}

	public void meth2() {
		System.out.println("Meth2 of class My");
	}

	public void meth3() {
		System.out.println("Meth3 of class My");
	}
}

public class InterfacesExample {
	public static void main(String[] args) {
		Test t=new My();
		//here i will do My than all three method will call
		t.meth1();
		t.meth2();
		//t.meth3();
	}

}
