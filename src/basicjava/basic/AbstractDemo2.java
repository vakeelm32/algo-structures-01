package basicjava.basic;

public class AbstractDemo2 {

	public static void main(String[] args) {
		HDFC11 obj = new HDFC11(10, 20, 30, 40);
		
		obj.bM();
		obj.dM();
		obj.aM();
	}
}

abstract class Bank11 {
	int a;
	Bank11(int a) {
		this.a = a;
	}
	public void aM() {
		System.out.println("aM " + a);
	}
	abstract public void dM();
}

class HDFC11 extends Bank11 {
	int b;
	int c;
	int d;
	HDFC11(int a, int b, int c, int d) {
		super(a);
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public void bM() {
		System.out.println(b + " " + c + " ");
	}
	@Override
	public void dM() {
		System.out.println(d);
	}

}
