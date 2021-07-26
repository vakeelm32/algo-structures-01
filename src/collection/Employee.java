package collection;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public static void main(String[] args) {

		char c = '1';
		Employee e = new Employee();
		List l1 = new ArrayList();
		l1.add(true);
		l1.add(10);
		l1.add("abc");
		l1.add("fge");
		l1.add(c);

		System.out.println(l1);
		for (int i = 0; i < l1.size(); i++) {
			Object s = l1.get(i);
			if (s instanceof String) {
				String s1 = (String) s;
				System.out.println("String uppercase = " + s1.toUpperCase());
			}

		}
	}
}
