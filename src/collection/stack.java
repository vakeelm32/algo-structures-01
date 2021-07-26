package collection;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();

		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);

		System.out.println(s);

		System.out.println("pop1 : " + s.pop());

		System.out.println(s);

		System.out.println("peek : " + s.peek());

		System.out.println(s);

		s.capacity();
		System.out.println("capacity : " + s.capacity());

		s.contains(30);
		System.out.println("contains : " + s.contains(30));

		s.remove(0);
		if (s.contains(40)) {
			System.out.println("element removed");
		}
		System.out.println(s);

		s.clear();
		System.out.println("After clearing  : " + s.isEmpty());

	}
}