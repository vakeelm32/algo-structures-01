package exceptiom;

import java.util.Scanner;

public class ExceptiomDemo2 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter 2 numbers");
		a = sc.nextInt();
		System.out.println("you entered a = "+a);
		b = sc.nextInt();
		System.out.println("you entered b = "+b);
		
		c = a / b; // throw new ArithmeticException("/ by Zero")
		
		System.out.println("Division is = " + c);

		System.out.println("Bye");

	}

}
