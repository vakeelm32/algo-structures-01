package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo2 {
	public static void main(String[] args) {

		ArrayList<PersonT> list = new ArrayList<>();

		PersonT p1 = new PersonT("vakeel", "Banglore", 12);
		PersonT p2 = new PersonT("aftab", "Mumbai", 1);
		PersonT p3 = new PersonT("aftimran", "Pune", 5);
		PersonT p4 = new PersonT("mubin", "Delhi", 20);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		System.out.println("Before sorting");
		System.out.println(list);

		Collections.sort(list);

		System.out.println("After sorting");
		System.out.println(list);

	}

}

class PersonT implements Comparable<PersonT> {
	private String name;
	private String city;
	private int age;

	public PersonT(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonT [name=" + name + ", city=" + city + ", age=" + age + "]";
	}

	/*
	 * @Override public int compareTo(PersonT person) { // +ve == increasing order
	 * // -ve == decreasing order // 0 == no order int result = 0; if (this.getAge()
	 * > person.getAge()) { result = 1; } if (this.getAge() < person.getAge()) {
	 * result = -1; } return result; }
	 */

	@Override
	public int compareTo(PersonT person) {
		//return this.getName().compareTo(person.getName());
		return person.getName().compareTo(this.getName());
	}

}
