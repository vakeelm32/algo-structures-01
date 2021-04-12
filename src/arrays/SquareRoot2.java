package arrays;

public class SquareRoot2 {

	public static void main(String[] args) {
		int number = 12;
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
		System.out.println(result);
	}
}

// crt+space
