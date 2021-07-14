package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		//1.Create a new arrayList
		List<Integer> l1 = new ArrayList<Integer>(15);
		
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(2, 10);
		
		//iterations
		for(int i=0;i<l1.size();i++) {
			if(l1.get(i) == 7) { //l1.get(0);
				System.out.println(true);
			}
		}
		
		for(Integer m : l1) {
			if(m == 7) { 
				System.out.println(true);
			}
		}
		
		l1.remove(5);
		
		if(l1.contains(21)) {
			System.out.println("abc");
		}
		
		System.out.println("isempty before clear:"+l1.isEmpty());
		l1.clear();
		System.out.println("isEmpty after clear:" + l1.isEmpty());
		
	
		
		//invalid index
		//l1.add(12, 11);
		
		System.out.println(l1);
		
		
		//ArrayList<Integer> l1 = new List<Integer>();
		
		
		//List<Integer> l3 = new List<Integer>(); - cannot do this as List is an interface
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		
		//custom object
		
		Employee e1 = new Employee(1001,"abc");
		Employee e2 = new Employee(1002,"def");
		Employee e3 = new Employee(1003,"ghi");
		Employee e4 = new Employee(1004,"xyz");
		Employee e5 = new Employee(1005,"ipo");
		
		int imran = 5;
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		listOfEmployees.add(e5);
		
		for(int i=0;i<listOfEmployees.size();i++) {
			
			System.out.println(listOfEmployees.get(i));
		}
	}
	
	

}


class Employee{
	
	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
		
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	
	
	
}
