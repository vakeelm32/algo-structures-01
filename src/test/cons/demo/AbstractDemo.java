package test.cons.demo;

public class AbstractDemo {

	public static void main(String[] args) {
		HDFC1 obj = new HDFC1();
		obj.intrestRateOnLoan();
		obj.intrestRateOnSavingAc();
	}
}

abstract class Bank1 {
	public void intrestRateOnLoan() {
		System.out.println("Bank - intrestRateOnLoan");
	}

	abstract public void intrestRateOnSavingAc();
}

class HDFC1 extends Bank1 {

	@Override
	public void intrestRateOnSavingAc() {
		System.out.println("HDFC1 - intrestRateOnSavingAc");

	}

	public void intrestRateOnLoan() {
		System.out.println("HDFC1 - intrestRateOnLoan");
	}

}
