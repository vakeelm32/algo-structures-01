package basicjava.basic;

public class ConsDemo3 {

	public static void main(String[] args) {
		Person3 p1 = new Person3(10,"Banglore",123);
		int age = p1.getAge();
		System.out.println(age);
		p1.setAge(100);
	}
}

class Person3 {

	private int age;
	private int rollNumber;
	private String city;

	// invisible default constructor
	public Person3(int age, String city, int rollNumber) {
		this.age = age;
		this.city = city;
		this.rollNumber = rollNumber;
	} // it will remove default constructor
	
	public Person3() {
		
	}

	public int getAge() {
		// you can write your own logic to return the age
		//
		if (age > 18) {
			return 0;
		} else {
			return 1;
		}
	}

	public void setAge(int age) {
		// add logic to add age to your object
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}
