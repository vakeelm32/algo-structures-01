package start;

public class CheckCount {
	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 7 };
		int key = 3;
		int start = 0;
		int end = a.length - 1;
		int lower = 0;
		int upper = 0;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] >= key) {
				lower = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}

			if (a[mid] > key) {
				upper = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
	}


}
