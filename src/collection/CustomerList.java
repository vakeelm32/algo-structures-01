package collection;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {

	public static void main(String[] args) {

		// 1.Create a new arrayList
		List<String> c = new ArrayList();

		c.add("customerId");
		c.add("name");
		c.add("adress");
		c.add("city");
		c.add("zip");
		c.add("email");
		c.add("phone");
		c.add("mobile");
		c.add("gender");

		System.out.println(c);
	}
}