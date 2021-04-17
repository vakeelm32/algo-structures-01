package recursion;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		function(100);
		System.out.println("4");
		System.out.println("5");
	}

	public static void function(int n) {

		System.out.println("start - calling funciton with value " + n);
		//
		//
		//
		function(n);
		//
		//
		System.out.println("end - calling funciton with value " + n);
	}
}
