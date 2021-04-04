package test;

public class MinMax {
	public static void main(String[] args) {

		int[] a = { 2, 4, 1, 12, 9, 30, 4 };
		int min = a[0];
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println(max+min);

	}
}
