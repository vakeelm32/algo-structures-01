package javasection;

abstract class Shape {
	abstract public double perimeter();

	abstract public double area();

}

class Circle extends Shape {
	double radius;

	public double perimeter() {
		return 2 * Math.PI * radius * radius;

	}

	public double area() {
		return Math.PI * radius;
	}

}

class Rectangle extends Shape {
	double length;
	double breadth;

	public double perimeter() {
		return 2 * (length + breadth);

	}

	public double area() {
		return length * breadth;
	}

}

public class AbstractShapeExample {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.length = 10;
		r.breadth = 5;
		
		
		System.out.println("Area of Rectangle " +r.area());
		Shape s=r;
		System.out.println("Area of Shape " +s.area());

	}

}
