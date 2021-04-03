package start;

public class Rootsquare {
	

		public static void main(String[] args) {
			int number = 10;
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
