package start;

public class MaxElement {

	public static void main(String[] args) {

		System.out.println("TESTING");
		int[] a = new int[10];
		a[0] = 1;
		a[1] = 3;
		a[2] = 10;
		a[3] = 13;
		a[4] = 96;
		a[5] = 24;

		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				
			}
			
		}
		
		 System.out.println("Maximum value in the array is:: " + max);
		
		}

}

