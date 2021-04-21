package recursion;

public class Convert {

	public String replacePi(String str) {

		if (str.length() <= 1) {
			return str;
		}

		if (str.charAt(0) == 'p' && str.length() >= 2 && str.charAt(1) == 'i') {
			return "3.14" + replacePi(str.substring(2, str.length()));
		}

		return str.charAt(0) + replacePi(str.substring(1, str.length()));
	}

	public static void main(String args[]) {
		Convert g = new Convert();
		String str = "pippppiiiipi";
		System.out.println(g.replacePi(str));
	}
}
