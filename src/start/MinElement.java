package start;

public class MinElement {

	public static void main(String[] args) {

		int[] a = new int[6];
		a[0] = 11;
		a[1] = 3;
		a[2] = 10;
		a[3] = 1;
		a[4] = 96;
		a[5] = 24;

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];

			}

		}

		System.out.println("Minimum value in the array is:: " + min);

	}

}