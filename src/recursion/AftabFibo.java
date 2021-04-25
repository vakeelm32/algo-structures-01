package recursion;

import java.util.Arrays;

public class AftabFibo {
	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 8, 9 };
		int[] b = { 2, 3, 5 };
		int x = a.length;
		int[] c = new int[x];
		int[] d = new int[b.length];
		// {1,2,3,4,5}
		// {6,8,9}
		int p1 = 0;
		int p2 = 0;

		int count1 = 0;
		int count2 = 0;

		while (p1 < a.length && p2 < b.length) {

			int a1 = a[p1];
			int b1 = b[p2];

			if (a1 < b1) {
				c[count1] = a1;
				d[count2] = a1;
				p1++;

			} else {
				c[count1] = b1;
				d[count2] = b1;
				p2++;
			}

			count1++;
			count2++;

		}
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));

	}

}