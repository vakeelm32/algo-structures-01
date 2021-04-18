package recursion;

public class Recursion {
	public static void main(String[] args) {
		function(100);
	}

	public static void function(int n) {

		if (n > 1) {
			function(n - 1);

		}
		System.out.println(n);

	}

}
