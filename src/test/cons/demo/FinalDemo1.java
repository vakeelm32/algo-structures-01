package test.cons.demo;

public class FinalDemo1 {

	FinalDemo1() throws Exception {
		for(int i=0;i<10000;i++) {
			for(int j=0;j<10000;j++) {
			}
		}
	}

	public static void main(String[] args) throws Exception {

		final int x = 100;
		// System.out.println(x);

		// x = 1000;
		// System.out.println(x);

		long start = System.currentTimeMillis();
		FinalDemo1 obj1 = new FinalDemo1();
		long totalTimeForInObjectCreation = (System.currentTimeMillis() - start) ;
		System.out.println( "time taken in mili seconds - " + totalTimeForInObjectCreation);

	}

}
