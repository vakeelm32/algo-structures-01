package basicjava.basic;

class Sapient2 {
	static String companyName = "Sapient";
	int salary;

	Sapient2(int salary) {
		this.salary = salary;
	}

	void show() {
		System.out.println("Inside show non static" + this.salary + "" + companyName);
	}

	static void display() {
		System.out.println("I am inside static method " + companyName);
		// you can not access non static in a static method
	}
}

public class StaticPractice2 {

	static int x = 10;
	public static void main(String[] args) {

		String companyName = Sapient2.companyName;
		System.out.println(companyName);

		Sapient2.display();

		System.out.println(x);
		// Sapient2.show();
		Sapient2 obj = new Sapient2(100);
		int salary = obj.salary;
		System.out.println(salary);
		
	}

}
