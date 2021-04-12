package arrays;

public class TargetSum2 {

	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 8, 12, 20, 5 };
       
		int target = 13;

		for (int i = 0; i < a.length; i++) {
			int element = a[i];
			int remaing = target - element;

			// System.out.println(remaing);

			for (int j = i; j < a.length; j++) {
				if (remaing == a[j]) {
					System.out.println(i + " "+  j);
					break;
				}
			}

		}

	}

}
