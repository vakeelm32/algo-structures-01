package test.cons.demo;

class Circle {
	public double radius;

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public double circumference() {
		return perimeter();
	}
}

class Cylinder extends Circle {
	public double height;

	public double volume() {
		return area() * height;
	}
}

public class AppTest1 {

	public static void main(String[] args) {
		Cylinder obj = new Cylinder();
		obj.height = 10;
		obj.radius = 12;
		
		double circumference = obj.circumference();
		System.out.println(circumference);

	}
}