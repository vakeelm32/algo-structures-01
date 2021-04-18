package recursion;

public class OneToHundred {
	public static void main(String[] args) {
		function(100);
	}

	public static void function(int n) {

		if (n > 0) {
			function(n - 1);
        System.out.println(n);
		}
		

	}

}
