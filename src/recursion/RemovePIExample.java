package recursion;

public class RemovePIExample {

	public static void main(String[] args) {

		String str = "pippxxppiixipi";

		// "3.14ppxxp3.14ixi3.14"
		replacePI(str);

	}

	public static void replacePI(String str) {

		if (str.length() == 0) {
			return;
		}
		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			System.out.print("3.14");
			replacePI(str.substring(2));
		} else {
			System.out.print(str.charAt(0));
			replacePI(str.substring(1));
		}

	}

}
