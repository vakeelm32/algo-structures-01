package windowsliding;

public class PrintSubArray {

	public static void main(String[] args) {
		int[] a = { 2, 5, 1, 6, 8, 10, 20, 15, 4, 7 };
		int k = 4;

		for (int i = 0; i < a.length-k; i++) {

			for (int j = i; j < i + k; j++) {

				System.out.print(a[j] + ", ");

			}
			System.out.println(" ");

		}
	}

}
