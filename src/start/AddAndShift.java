package start;

public class AddAndShift {

	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 1;
		a[1] = 3;
		a[2] = 10;
		a[3] = 13;
		a[4] = 11;
		a[5] = 24;

		int index = 4;
		int value = 100;


		for (int i = 0; i < a.length; i++) {
			
			if(i == index)
			a[i] = value;
				
				
			}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
			

		}

		// print array
	

	}
