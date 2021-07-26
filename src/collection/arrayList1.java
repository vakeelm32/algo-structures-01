package collection;

import java.util.ArrayList;
import java.util.List;

public class arrayList1 {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList();
		List<String> l2 = new ArrayList();

		l2.add("abc");
		l2.add("def");
		l2.add("ghi");

		l1.add("jkl");
		l1.add("mno");
		l1.add("pqr");

		l2.addAll(l1);

		System.out.println("l1 : " + l1);
		System.out.println("l2 : " + l2);
		//l2.addAll(2, l1);
		System.out.println("index : " + l2);
	}

}
