package collections;

import java.util.*;

public class StackDemo {
	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		System.out.println(s);
		
		System.out.println("Pop 1 :" + s.pop());
		System.out.println(s);
		
		System.out.println("Peek : " + s.peek());
		
		System.out.println("Push 1: "+ s.push(50));
		System.out.println(s);
	}

}
