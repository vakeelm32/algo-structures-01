package windowsliding;

public class SlidingWIndowSum {

	public static void main(String[] args) {
		int[] a = { 2, 5, 1, 7, 6, 8, 3, 4, 2, 3 };
		int k = 4;

		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum = windowSum + a[i];
		}
		System.out.println("Window sum " + windowSum);

		for (int j = 1; j < a.length - k + 1; j++) {

			int elementToBeDeleted = a[j - 1];
			int elementToBeAdded = a[j + k - 1];
			windowSum = windowSum + elementToBeAdded - elementToBeDeleted;
			System.out.println("Window Sum " + windowSum);
		}

	}
}
