package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// Declaring a hashset
		Set<Integer> h1 = new HashSet<Integer>(5);
		List<Integer> a1 = new ArrayList<Integer>();
		
		Employee e1 = new Employee(1001, "abc");
		Employee e2 = new Employee(1002, "def");
		Employee e3 = new Employee(1003, "ghi");
		Employee e4 = new Employee(1006, "jkl");
		Employee e5 = new Employee(1005, "mno");
		
		Set<Employee> h4 = new HashSet<Employee>();
		
		h4.add(e1);
		h4.add(e2);
		h4.add(e5);
		h4.add(e3);
		h4.add(e4);
		h4.add(e5);

		System.out.println("Employee HashSet : " + h4);
		
		h1.add(10);
		h1.add(100);
		h1.add(80);
		h1.add(70);
		h1.add(80);
		h1.add(60);
		
		
		a1.add(10);
		a1.add(100);
		a1.add(80);
		a1.add(70);
		a1.add(60);
		a1.add(80);
		System.out.println("Hashset is : " + h1);
		
		System.out.println("ArrayList is : " + a1);
		
		System.out.println("hashset  contains 80: " + h1.contains(80));
		
		

		HashSet<Integer> h2 = new HashSet<Integer>();
	}
}
