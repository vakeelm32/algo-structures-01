package twopointer;

public class SquareAndDecending {
	public static void main(String[] args) {

		int[] a = { -10, -3, -1, 0, 2, 5 };

		int left = 0;
		int right = a.length - 1;

		while (left <= right) {

			int leftsquare = a[left] * a[left];
			int rightsquare = a[right] * a[right];

			if (leftsquare > rightsquare) {
				left = left + 1;
				System.out.println(leftsquare);

			} else {
				right = right - 1;
				System.out.println(rightsquare);
			}

		}
	}

}
