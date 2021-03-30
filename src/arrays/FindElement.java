package arrays;

public class FindElement {
	public static void main(String[] args) {

		int[] a = { 2, 5, 8, 10, 13, 17, 19, 23 };

		int target = 13;
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
				result = mid;
				break;
			}

		}
		System.out.println("** element at index : " + result);

	}

}
