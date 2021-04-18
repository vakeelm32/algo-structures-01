package windowsliding;

public class SubElements {
	public static void main(String[] args) {

		int[] a = { 3, 1, 5, 4, 8, 9, 3, 5, 6, 1 };
		int k = 4;

		for (int i = 0; i <= a.length - k; i++) {
			for (int j = i; j < i + k; j++) {
				System.out.print(a[j] + ",");

			}
			System.out.println(" ");

		}

	}
}
