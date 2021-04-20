package recursion;

public class ReverseString {

	public static void main(String[] args) {
		String name = "aftab";
		reverse(name);
	}
	public static void reverse(String str) {
		if (str.length() == 0) {
			return;
		}
		String remaingStr = str.substring(1);
		reverse(remaingStr);
		System.out.println(str.charAt(0));
	}
}

// 1.
// pippxxppiixxpi

// 3.14ppxxp3.14ixx3.14

// aabccd
// abcd 


