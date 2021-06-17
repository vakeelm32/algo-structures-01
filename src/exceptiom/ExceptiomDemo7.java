package exceptiom;

import java.util.Scanner;

public class ExceptiomDemo7 {

	public static void main(String[] args) {

		System.out.println("1");
		int result = 0;
		try {
			result = display();
		} catch (ArithmeticException e) {
			System.out.println("there is some problem please try after some time");
		}
		System.out.println("*************MAIN START*******************");
		System.out.println(result);
		System.out.println("3");
	}

	public static int display() throws ArithmeticException {
		int a;
		int b;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter 2 numbers");
		a = sc.nextInt();
		System.out.println("you entered a = " + a);
		b = sc.nextInt();
		System.out.println("you entered b = " + b);
		c = a / b; //
		System.out.println("2");
		return c;

	}

}
