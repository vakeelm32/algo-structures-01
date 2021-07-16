package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList();
		List<String> l2 = new ArrayList();
		
		l1.add("abc");
		l1.add("def");
		l1.add("xyz");
		
		l2.add("xcc");
		l2.add("qqs");
		l2.add("asa");
	
		
		l2.addAll(l1);
		
		
		System.out.println("l1 : " + l1);
		System.out.println("l2 : " + l2);
		l2.addAll(2, l1);
		System.out.println("l2 at index : " + l2);
	}

}
