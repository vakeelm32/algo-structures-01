package start;

public class LowerBound {
	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 6, 10, 11, 14, 15 };

		int target = 4;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > target) {
				System.out.println("Lower bound of target is at index:" + i);
				break;

			}

		}
	}

}
