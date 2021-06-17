package exceptiom;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptiomDemo5 {

	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("asdhvahsvahsdv");
		} catch (FileNotFoundException e) {
			System.out.println("Exception occurred");
		}
		
		System.out.println("end");

	}

}
