
package start;
import java.util.Arrays;
public class reverseArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		int[] c = new int[a.length];

		int last = a.length - 1;
		int counter = 0;
		for (int i = last; i >= 0; i--) {
			int element = a[i];
			c[counter] = element;
			counter++;
		}
		System.out.println(Arrays.toString(c));

	}
}