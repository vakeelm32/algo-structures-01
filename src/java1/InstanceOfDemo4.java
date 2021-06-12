package java1;

public class InstanceOfDemo4 {

	public static void main(String args[]) {

		int d = 90;
		byte x = (byte) d;
		System.out.println(x);

		int l = 1000;
		byte m = (byte) l;
		System.out.println(m);

		int p = 129;
		byte q = (byte) p;
		System.out.println(q);

		float a = 90.10f;
		int b;
		b =  (int)a; // explicit cast (convert bigger type into smaller type), and programmer has to
						// do explicitly
		System.out.println(b);
		
	}
}