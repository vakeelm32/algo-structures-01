package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>();

		s1.add(25);
		s1.add(2);
		s1.add(250);
		s1.add(12);
		s1.add(45);
		s1.add(23);
		s1.add(250);

		Set<Integer> s2 = new HashSet<Integer>();

		s2.add(21);
		s2.add(89);
		s2.add(32);
		s2.add(65);
		s2.add(90);
		s2.add(1);
		s2.add(0);

		System.out.println("Linked HashSet : " + s1);

		s1.addAll(s2);

		System.out.println("Added hashset : " + s2);

		System.out.println("Added LinkedHashset : " + s1);
		
		for(Integer i : s1) {
			if(i==25) {
				System.out.println("adding 2 to 25 : " + i + 2 );
			}
			System.out.println("LinkedHashSet i : " + i);
		}
		
		for(Integer i : s2) {
			if(i == 32) {
				System.out.println("Element found 32 : " + i);
			}
			System.out.println("hashset i : " + i);
		}

	}

}
