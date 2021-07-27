package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo1 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("vakeel");
		list.add("aftab");
		list.add("imran");
		list.add("mubin");

		System.out.println("before sorting");
		System.out.println(list);
		
		Collections.sort(list); // merge sort
		
		System.out.println("After sorting");
		System.out.println(list);
		
		System.out.println("--------------------------------");
		
		ArrayList<Integer> l2 = new ArrayList<>();

		l2.add(23);
		l2.add(43);
		l2.add(1);
		l2.add(5);

		System.out.println("before sorting");
		System.out.println(l2);
		
		Collections.sort(l2); // merge sort
		
		System.out.println("After sorting");
		System.out.println(l2);

	}

}
