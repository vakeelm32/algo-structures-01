package start;

public class CountVowelsInLoop {
	public static void main(String[] args) {

		String str = "ABCBEOUI";
		int k = 4;

		int sum = 0;
		for (int i = 0; i < k; i++) {
			char element = str.charAt(i);
			boolean isVowel = isVowel(element);
			if (isVowel) {
				sum = sum + 1;
				
				
			}
			
		}
		System.out.println("window sum - " + sum);

		for (int j = 1; j < str.length() - k + 1; j++) {

			char elementToBeDeleted = str.charAt(j - 1);
			char elementToBeAdded = str.charAt(j + k - 1);

			if (isVowel(elementToBeDeleted)) {
				sum = sum - 1;
			}
			if (isVowel(elementToBeAdded)) {
				sum = sum + 1;
			}

			System.out.println("window sum - " + sum);
		}

	}

	public static boolean isVowel(char element) {
		boolean isVowel = false;
		if (element == 'A' || element == 'E' || element == 'I' || element == 'O' || element == 'U') {
			isVowel = true;
		}
		return isVowel;
	}

}
