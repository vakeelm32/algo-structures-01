package start;

public class SubArray {
	public static void main(String[] args )
	{
		int[] a = {6, 4, 3, 7, 10, 11, 13, 16, 20, 21  };
		int k = 4;

		for (int i = 0; i < a.length-k; i++) {

			for (int j = i; j < i + k; j++) {

				System.out.print(a[j] + ", ");

			}
			System.out.println(" ");

		}
	}



	}


