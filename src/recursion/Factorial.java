package recursion;

public class Factorial {
	public static void main(String[] args) {

		int factorial = factorial(6);
		System.out.println(factorial);
	}

	public static int factorial(int number) {

		if (number == 1) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

}
