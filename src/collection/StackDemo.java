package collection;

import java.util.Stack;

public class StackDemo {

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
		
		System.out.println("pop2 : " + s.pop());
		
		System.out.println(s);
		
		System.out.println("peek : " + s.peek());
		
		System.out.println(s);
		
		System.out.println("pop3 : " + s.pop());
		
		System.out.println(s);
	}
}
