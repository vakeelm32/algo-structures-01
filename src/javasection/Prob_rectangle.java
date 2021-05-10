package javasection;

class TestRec {
	public double length;
	public double breadth;

	public double area() {
		return length * breadth;

	}

	public double parimeter() {
		return 2 * (length + breadth);
	}

	public boolean isSquare() {
		return length == breadth;
	}
}

public class Prob_rectangle {
	public static void main(String[] args) {
		TestRec r = new TestRec();
		r.length = 10.5;
		r.breadth = 6.5;

		System.out.println("Area :" + r.area());
		System.out.println("Perimeter :" + r.parimeter());
		System.out.println("isSquare :" + r.isSquare());
	}
}
