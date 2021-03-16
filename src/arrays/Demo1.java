package arrays;

public class Demo1 {

	public static void main(String[] args) {
		// 1 way
		int[] a = new int[5];
		System.out.println(a[0]);

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		// a[5] = 6;

		a[0] = 10;
		System.out.println(a[4]);
		System.out.println(a[0]);

		// 2nd way
		int[] b = { 10, 2, 13, 4, 5 };
		System.out.println(a[1]);
		System.out.println(a[3]);

		System.out.println("***********printing arry");
		 
		// 0 < 5
		// 1 < 5
		// 2 <5 
		// 3 <5
		// 4 < 5
		// 5 < 5
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
		}

	}
}
