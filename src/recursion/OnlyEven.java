package recursion;

public class OnlyEven {
	public static void main(String[] args) {
		
		function(100);
	}

	public static void function(int n) {
		int even = 0;

		if (n > 1) {
			function(n - 1);

		}

		if (n % 2 == 0) {
			even = n;
			System.out.println(even);

		}
		

	}

}
