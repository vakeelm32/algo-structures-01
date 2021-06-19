package exceptiom;

import java.io.IOException;

public class ExceptiomDemo13 {

	public static void main(String[] args) {

		String accountNumber = null;
		Person1000 p = new Person1000();
		try {
			 accountNumber = p.getAccountNumber("vakeel");
		} catch (IOException e) {
			System.out.println("Error occurred, pls try after some time");
		}

		System.out.println(accountNumber);

	}

}
