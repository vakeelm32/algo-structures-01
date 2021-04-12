package arrays;

public class UpperBoundExample {
	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 8, 10, 13, 17, 19, 23 };

		int key = 9;
		int start = 0;
		int end = a.length - 1;
		int result = 0;

		while (start <= end) {
			System.out.println("Start : " + start + " | End : " + end);
			int mid = (start + end) / 2;

			if (a[mid] > key) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		System.out.println(result);

	}
}

// crt + shift +f
