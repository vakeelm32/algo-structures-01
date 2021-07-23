package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//creating a linkedList
		LinkedList<Integer> ll1 = new LinkedList<>();
		LinkedList<Integer> ll3 = new LinkedList<>();
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(45);
		a1.add(46);
		
		
		ll1.add(5);
		ll1.add(6);
		ll1.add(7);
		ll1.add(8);
		ll1.add(9);
		ll1.add(5);
		
		LinkedList<String> ll2 = new LinkedList<>();
		
		//not allowed
		//LinkedList<Integer> ll3 = new LinkedList<>(5);
		
		//fetching an element
		ll1.get(4);
		
		
		ll2.add("abc");
		
		//removing an element
		ll1.remove(2);
		
		for(Integer m : ll1) {
			if(m == 8) { 
				System.out.println(true);
			}
		}
		
		ll1.addAll(2,a1);
		ll1.add(4, 10);
		
		
		LinkedList ll4 = new LinkedList<>();
		
		ll4.add("sabiha");
		ll4.add(1);
		ll4.add(1.0);
		
		
		
		System.out.println("head element : " + ll1.element());
		System.out.println("Linked list : " + ll1);
		System.out.println("element at index 4 :" + ll1.get(4));
		
		
	}
	
	
	
}
