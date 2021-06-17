package exceptiom;

import java.util.Scanner;

public class ExceptiomDemo6 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter 2 numbers");
		a = sc.nextInt();
		System.out.println("you entered a = " + a);
		b = sc.nextInt();
		System.out.println("you entered b = " + b);

		try {
			if (b == 0) {
				throw new ArithmeticException("b can not be zero while deviding the numbers");
			}

		} catch (ArithmeticException e) {
			System.out.println("Division is = " + e.getMessage());
		}
		System.out.println("Bye");

	}

}
