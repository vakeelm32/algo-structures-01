package recursion;

public class Demo3 {
	public static void main(String[] args) {

		function(5);
	}

	public static void function(int n) {
		
		if (n > 0) {
			System.out.println(n);
			function(n - 1);
		}

	}
}

// Print number from from 1 t0 100
// Print number from 100 to 1
// Print only even numbers b/w range 1-100
