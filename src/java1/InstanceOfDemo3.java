package java1;

public class InstanceOfDemo3 {

	public static void main(String args[]) {

		int a; // take 4 bytes in memory
		byte b = 20; // take 1 byte in memory
		a = b; // Implicit cast ( this cast conversion happens automatically , because //bigger
				// type can hold smaller type)

		float x;
		int y = 90;
		x = y;

		System.out.println(a);
		System.out.println(x);

		

	}
}