package basicjava.basic;

class Sapient {
	static String companyName = "Sapient";
	int salary;

	Sapient(int salary) {
		this.salary = salary;
	}

	void display() {
		System.out.println(this.salary);
	}
}

public class StaticPractice {

	public static void main(String[] args) {

		Sapient p1 = new Sapient(100);
		Sapient p2 = new Sapient(50);
		Sapient p3 = new Sapient(10);
		Sapient p4 = new Sapient(20);

		System.out.println("p1 salary and name " + p1.salary + " "+p1.companyName);
		System.out.println("p2 salary and name " + p2.salary + " "+p2.companyName);
		System.out.println("p3 salary and name " + p3.salary + " "+p3.companyName);
		System.out.println("p4 salary and name " + p4.salary + " "+p4.companyName);
		p1.salary = 150;
		
		System.out.println("---");
		System.out.println("p1 salary and name " + p1.salary + " "+p1.companyName);
		System.out.println("p2 salary and name " + p2.salary + " "+p2.companyName);
		System.out.println("p3 salary and name " + p3.salary + " "+p3.companyName);
		System.out.println("p4 salary and name " + p4.salary + " "+p4.companyName);
		
		p2.companyName = "HCL";
		
		System.out.println("---");
		System.out.println("p1 salary and name " + p1.salary + " "+p1.companyName);
		System.out.println("p2 salary and name " + p2.salary + " "+p2.companyName);
		System.out.println("p3 salary and name " + p3.salary + " "+p3.companyName);
		System.out.println("p4 salary and name " + p4.salary + " "+p4.companyName);
		
		Sapient.companyName = "Infosys";
		
		System.out.println("---");
		System.out.println("p1 salary and name " + p1.salary + " "+p1.companyName);
		System.out.println("p2 salary and name " + p2.salary + " "+p2.companyName);
		System.out.println("p3 salary and name " + p3.salary + " "+p3.companyName);
		System.out.println("p4 salary and name " + p4.salary + " "+p4.companyName);
	}

}
