package Staticpratice;

class Testpractice {
	static {
		System.out.println("Block 1");
	}
	static {
		System.out.println("Block 2");
	}
}

public class StaticBlocks {
	public static void main(String args[]) {
		System.out.println("Main");
		Testpractice t = new Testpractice();

	}

}
