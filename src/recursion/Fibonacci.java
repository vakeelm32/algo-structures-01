package recursion;

public class Fibonacci {

	public static void main(String args[]) {
		int n = 3;
		System.out.println("fibonacci number is " + fib(n));
	}

	public static int fib(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);
	}
}