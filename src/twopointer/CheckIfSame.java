package twopointer;

import java.util.Arrays;

public class CheckIfSame {
	public static void main(String[] args) {

		int[] a = { 2, 5, 7, 8, 9 };
		int[] b = { 1, 2, 5, 4, 9, 10 };

		int[] c = new int[10];
		int p1 = 0;
		int p2 = 0;

		int count = 0;

		while (p1 < a.length - 1 && p2 < b.length - 1) {

			int element1 = a[p1];
			int element2 = b[p1];
			if (element1 < element2) {
				p1 = p1 + 1;

			} else if (element1 > element2) {
				p2 = p2 + 1;

			} else {
				System.out.println(element1);
				p1++;
				p2++;
			}

		}

	}

}
