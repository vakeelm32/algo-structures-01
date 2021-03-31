package start;

public class UpperBound {
	public static void main(String[] args) {

		int[] a = { 4, 7, 11, 18, 21, 26, 30, 35 };

		int target = 26;
		int start = 0;
		int end = a.length - 1;
		int result = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] < target) {
				start = mid + 1;
			} else if (a[mid] > target) {
				end = mid - 1;
			} else {
				result = mid + 1;
				break;
			}

		}
		System.out.println("Upper Bound of the target is at the index : " + result);

	}

}
