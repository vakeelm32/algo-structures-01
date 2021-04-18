package windowSliding;

public class vowels {
	public static void main(String[] args) {

		String str = "ABCBEOUI";

		int k = 4;

		for (int i = 0; i < str.length() - k + 1; i++) {

			int sum = 0;
			for (int j = i; j < i + k; j++) {

				char element = str.charAt(j);

				if (element == 'A' || element == 'E' || element == 'I' || element == 'O' || element == 'U') {
					sum = sum + 1;
				}

			}
			System.out.println("Window sum " + sum);

		}

	}

}


