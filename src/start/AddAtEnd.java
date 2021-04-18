package start;

public class AddAtEnd {
	public static void main(String[] args) {

		System.out.println("TESTING");
		int[] a = new int[10];
		a[0] = 1;
		a[1] = 3;
		a[2] = 10;
		a[3] = 13;
		a[4] = 11;
		a[5] = 24;
		System.out.println("Before Inserting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int element = 100;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				a[i] = element;
				break;
			}
		}
		
		System.out.println("After Inserting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
