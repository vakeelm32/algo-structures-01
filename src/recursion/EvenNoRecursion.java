package recursion;

public class EvenNoRecursion {
	public static void main(String[] args) {

		function(100);
	}

	public static void function(int n) {
		int even = 0;

		if (n > 0) {
			function(n - 1);

		}

		if (n % 2 == 0) {
			even = n;
			System.out.println(even);
		}
		

	}

}
