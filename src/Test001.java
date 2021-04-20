
public class Test001 {

	public static void main(String[] args) {
		String str = "vakeel";
		reverse(str);
	}

	public static void reverse(String str) {

		if (str.length() == 0) {
			return;
		}
		String substring = str.substring(1);
		reverse(substring);
		System.out.println(str.charAt(0));
	}
}
