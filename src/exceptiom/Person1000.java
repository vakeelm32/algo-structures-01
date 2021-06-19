package exceptiom;

import java.io.FileReader;
import java.io.IOException;

public class Person1000 {

	public String getSalary(int accounNumber) throws NumberFormatException, NullPointerException {

		String acc = accounNumber + "dds";
		int salary = Integer.parseInt(acc); // run time exception
		return salary + "";
	}

	public String getAccountNumber(String name) throws IOException {

		FileReader file = new FileReader("V:\\elegant\\codebases\\algo-structures-01\\test23");
		int read = file.read();
		return read + "";
	}
}
