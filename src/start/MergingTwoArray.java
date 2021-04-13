package start;
import java.util.Arrays;
public class MergingTwoArray {
	public static void main(String[] args) {

		int[] a = { 1,5,9,11};
		int[] b = {2,3,4,6,10,13,15,18,21 };



		int n1 = a.length;
		int n2 = b.length;

		int[] c = new int[n1 + n2];

		int p1 = 0;
		int p2 = 0;
		int count = 0;

		while (p1 < n1 && p2 < n2) {

			int aElement = a[p1];
			int bElement = b[p2];

			if (aElement < bElement) {
				c[count] = aElement;
				p1 = p1 + 1;
			} else {
				c[count] = bElement;
				p2 = p2 + 1;
			}
			count = count + 1;
		}
		System.out.println(Arrays.toString(c));

	
		while (p1 < n1) {
			int element = a[p1];
			c[count] = element;
			count++;
			p1++;
		}
		System.out.println(Arrays.toString(c));
		
		while (p2 < n2) {
			int element = b[p2];
			c[count] = element;
			count++;
			p2++;
		}
		System.out.println(Arrays.toString(c));

	}
}
