package exceptiom;

import java.util.Scanner;

public class ExceptiomDemo3 {

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
			c = a / b;
			System.out.println("Division is = " + c);
		} catch (NullPointerException e) {
			System.out.println("Denominator should not be 0, try again");
		}
		System.out.println("Bye");

	}

}
