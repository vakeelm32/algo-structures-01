package start;

public class upperbond {
//	package arrays;

//	public class UpperBoundExample {
		public static void main(String[] args) {

			int[] a = {12,14,15,16,17,21,22,23 };

			int key = 18;
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

