package arrays;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		System.out.println("Program started");
		Scanner scanner = new Scanner(System.in);

		int userEnteredValue = scanner.nextInt();

		System.out.println("printing user entered value - " +userEnteredValue);

		int number = userEnteredValue;
		for (int i = 1; i < number; i++) {

			if (i * i == number) {
				System.out.println(i);
				break;
			}
		}
	}
}

// crt+space
