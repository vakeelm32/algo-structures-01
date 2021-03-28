package arrays;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] argv) throws Exception {

        try {
            // create a new scanner
            // with the specified String Object
            Scanner scanner = new Scanner(System.in);

            // display the Old radix -  this is default radix, every number considered as decimal
            System.out.println("\nOld Radix: " + scanner.radix());

            
            // of the scanner to 2, it means if you give binary number it will convert it to decimal number
            scanner.useRadix(2);

            // display the new radix
            System.out.println("\nNew Radix: " + scanner.radix());

            int s1 = scanner.nextInt();
            System.out.println("New number: " + s1);

            // close the scanner
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
