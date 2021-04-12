import java.util.Arrays;

public class JavaTest {

	public static void main(String[] args) {

		int[] a = { 11, 2, 5, 1, 3, 6, 2, 12 };

		int n = a.length;
		int start = 0;
		int k = 11;

		int sumValue = 0;
		int ans = Integer.MAX_VALUE;

		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 1, 3)));
		for (int end = 0; end < n; end++) {

			sumValue = sumValue + a[end];
			while (sumValue >= k && end >= start) {
				if (sumValue == k) {
					ans = Math.min(ans, end - start + 1);
				}
				sumValue = sumValue - a[start];
				start = start + 1;
			}
		}
		System.out.println(ans);

	}

}
