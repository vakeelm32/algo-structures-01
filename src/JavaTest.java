
public class JavaTest {

	public static void print2largest() {

		int arr[] = { 12, 35, 1, 10, 2, 8 };
		int n = arr.length;

		int secondLargestElement = Integer.MIN_VALUE;
		int lagestElement = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int element = arr[i];
			if (element > lagestElement) {
				secondLargestElement = lagestElement;
				lagestElement = arr[i];
			} else if (element != lagestElement && element > secondLargestElement) {
				secondLargestElement = element;
			}
		}
		System.out.println("Second lagest element  - " + secondLargestElement);
	}

	public static void main(String[] args) {
		int arr[] = { 12, 35, 1, 10, 2, 80 };
		int n = arr.length;

		int secondLargestElementIndex = -1;
		int lagestElementIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			int element = arr[i];
			int elementAtLagest = arr[lagestElementIndex];
			if (element > elementAtLagest) {
				secondLargestElementIndex = lagestElementIndex;
				lagestElementIndex = i;
			} else if (element != elementAtLagest && element > arr[secondLargestElementIndex]) {
				secondLargestElementIndex = i;
			}
		}
		System.out.println("secondLargestElementIndex  - " + secondLargestElementIndex);
		print2largest();

	}
}
