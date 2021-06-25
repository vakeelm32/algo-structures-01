package exception;

import java.util.*;

public class question1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Please enter your name");
			String a = sc.nextLine();

			System.out.print("Your name is " + a);
			

			

		} catch (NullPointerException e) {
			System.out.println("please put your name");
		}

	}
}
