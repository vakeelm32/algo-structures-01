package recursion;

public class FibonnaciSeries {
	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;

	public static void fibonacciRecursion(int n) {

		if (n > 0) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			fibonacciRecursion(n - 1);
		}

	}

	public static void main(String args[]) {
		int maxNumber = 10;
	
		System.out.println(n1);
		System.out.println(n2);
		fibonacciRecursion(maxNumber - 2);

	}

}
