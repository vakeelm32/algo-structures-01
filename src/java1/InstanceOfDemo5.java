package java1;

public class InstanceOfDemo5 {

	public static void main(String args[]) {

		 Object test = test();

	}

	public static Object test() {
		InstanceOfDemo5 obj = new InstanceOfDemo5();
		return obj;
	}

	public static String testString() {
		String a = "asas";
		return a;
	}

}
