package start;

public class squareRoot {

	public static void main(String[] args) {
		
		int[] a = { 2, 5, 8, 10, 13, 17, 19, 23 };
		
		int number = a.length;
		int start = 0;
		int end = number;

		int result = 0;
		
		while (start <= end) {

			int mid = (start + end) / 2;

			if (mid * mid <= number) {
				result = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		System.out.println(result );
	}
}
