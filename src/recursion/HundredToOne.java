package recursion;

public class HundredToOne {
	public static void main(String[] args) {
		function(100);
	}

	public static void function(int n) {

		if (n > 0) {
			System.out.println(n);
			function(n - 1);

		}


	}

}
