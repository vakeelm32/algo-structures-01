package twopointer;

public class SquareAndDecending {

	public static void main(String[] args) {

		int[] a = { -10, -3, -1, 0, 2, 5 };
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {

			int leftSquare = a[left] * a[left];
			int rightSquare = a[right] * a[right];

			if (leftSquare > rightSquare) {
				left = left + 1;
				System.out.print(leftSquare);
			} else {
				right = right - 1;
				System.out.print(rightSquare);
			}
			System.out.print(", ");

		}
	}
}
