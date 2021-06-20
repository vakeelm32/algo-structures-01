package exceptiom;

import java.io.IOException;

public class ExceptiomDemo15 {

	public static void main(String[] args) throws IOException {

		int number = getNumber();
		System.out.println(number);
	}

	public static int getNumber() {
		try {
			int a[] = new int[10];
			a[12] = 900;
			System.out.println("try");
		}
		catch (Exception ee) {
			System.out.println("Exception is " + ee);
			System.exit(0);
			return 1;
		}
		finally {
			System.out.println("Inside Finally Block ");
			return 50;
		}
		
	}
}
