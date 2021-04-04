package test;

public class Occurence {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 2, 2, 3 };
		int target = 2;
		int start = 0;
		int end = a.length - 1;
		int x=0;
		int y=0;

		for (int i = 0; i < a.length; i++) {
			

			while (start <= end) {
				int mid = (start + end) / 2;
				if (a[mid] >= target) {
					x = a[mid];
					end = mid - 1;

				}
				else {
					start = mid + 1;

				}
				
				
			}
			while (start <= end) {
				int mid = (start + end) / 2;
				if (a[mid] > target) {
					y = mid;
					end = mid - 1;

				}
				else {
					start = mid + 1;

				}
				
				
			}
			
			
		}System.out.println(x+"  "+y);
	}

}
