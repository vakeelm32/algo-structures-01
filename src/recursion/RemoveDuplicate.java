package recursion;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String str = "aabbe";
		// abecd

		String remove = remove(str);
		System.out.println(remove);

	}

	public static String remove(String str) {

		if (str.length() == 0) {
			return "";
		}
		char ch = str.charAt(0);
		String ans = remove(str.substring(1));
		if (ans.length() != 0 && ch == ans.charAt(0)) {
			return ans;
		} else {
			return ch + "" + ans;
		}

	}
}
