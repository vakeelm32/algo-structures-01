package arrays;

public class DebugTest {

	public static void main(String[] args) {

		System.out.println("Start");
		int a = getValue();
		int b = 20;
		int sum = a + b;

		System.out.println(sum);
		System.out.println("Hello");

	}

	public static int getValue() {
		System.out.println("Hello Display");
		return 10;
	}
}
