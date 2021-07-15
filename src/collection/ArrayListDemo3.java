package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		Character c = '1';
		Employee e = new Employee(1001, "abc");
		List l1 = new ArrayList();
		l1.add(true);
		l1.add(5);
		l1.add("abc");
		l1.add(e);
		l1.add(c);

		System.out.println(l1);
		for (int i = 0; i < l1.size(); i++) {
			Object s = l1.get(i);

			if (s instanceof String) {
				String s1 = (String) s;
				System.out.println("String uppercase = " + s1.toUpperCase());
			}

			else if (s instanceof Employee) {
				Employee s2 = (Employee) s;
				System.out.println("employee id = " + s2.getEmpId());
			} else if (s instanceof Integer) {
				Integer s3 = (Integer) s;
				System.out.println("Integer 5 = " + ++s3);
			} else {
				System.out.println(l1.get(i));
			}

		}

		List<Integer> l2 = new ArrayList<Integer>();
		List<Character> l3 = new ArrayList<Character>();
		List<Boolean> l4 = new ArrayList<Boolean>();
		
		System.out.println("2nd index before removing : " + l1.get(2));
		l1.remove(2);
		System.out.println("2nd index after removing : " + l1);

	}

}
