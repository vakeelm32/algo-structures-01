
package start;

public class LowerBond {
	public static void main(String args[]) {
		int[] a = { 2, 3, 5, 6, 7, 9, 11, 13 };
		int target = 11;
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] < target) {
				start = mid + 1;
			}

			else if (a[mid] > target) {
				end = mid - 1;
			} else {
				System.out.println("lower element :" + mid);
				break;

			}
		}
	}
}
