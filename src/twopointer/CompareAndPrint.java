package twopointer;

import java.util.Arrays;

public class CompareAndPrint {
	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 9 };
		int[] b = { 2, 4, 6, 10, 12, 15 };

		int n1 = a.length;
		int n2 = b.length;
		
		int[] c = new int[n1 + n2];

		int p1 = 0;
		int p2 = 0;
		int count = 0;

		while (p1 < n1 && p2 < n2) {

			int element1 = a[p1];
			int element2 = b[p2];

			if (element1 < element2) {
				c[count] = element1;
				p1 = p1 + 1;

			} else {
				c[count] = element2;
				p2 = p2 + 1;
			}
			count = count + 1;

		}
		

		while (p1 < n1) {
			int element = a[p1];
			c[count] = element;
			count++;
			p1++;

		}
		
		while (p2 < n2) {
			int element = b[p2];
			c[count] = element;
			count++;
			p2++;

		}
		System.out.println(Arrays.toString(c));

	}

}
