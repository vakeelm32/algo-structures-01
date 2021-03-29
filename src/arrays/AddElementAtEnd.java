package arrays;

public class AddElementAtEnd {

	public static void main(String[] args) {

		int[] a = new int[10];
		a[0] = 1;
		a[1] = 3;
		a[2] = 10;
		a[3] = 13;
		a[4] = 11;
		a[5] = 24;

		System.out.println("Before Inserting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int index = 6;
		int element = 100;

		for (int i = 0; i < a.length; i++) {
			if (i > index) {
				a[i] = element;
			}
		}

		System.out.println("After Inserting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
