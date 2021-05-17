package basicjava.basic;

public class OverRidingDemo {

	public static void main(String[] args) {
		// Dog obj = new Dog();
		// obj.bark();
		//obj.eat();
		//obj.sleep();

		System.out.println("--------------");
		Animal obj2 = new Dog();
		//obj2.bark();
		obj2.eat();
		obj2.show();

	}
}

class Animal {
	public void eat() {
		System.out.println("Animal eating");
	}

	public void sleep() {
		System.out.println("Animal sleeping");
	}
	public void show() {
		System.out.println("SHow in Parent class");
	}
}

class Dog extends Animal {

	public void eat() {
		System.out.println("Dog way of eating");
	}

	public void bark() {
		System.out.println("Dog barking");
	}

}