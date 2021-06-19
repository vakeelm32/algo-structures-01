package exceptiom;

import java.io.IOException;

public class ExceptiomDemo14 {

	public static void main(String[] args) throws IOException {

		String accountNumber = null;
		Person1000 p = new Person1000();
		accountNumber = p.getAccountNumber("vakeel");

		System.out.println(accountNumber);

	}

}
