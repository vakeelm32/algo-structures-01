package test.cons.demo;

public class BankDemo {

	public static void main(String[] args) {
		HDFC obj1 = new HDFC();
		obj1.intrestRateOnLoan();
		obj1.intrestRateOnSavingAc();
		obj1.getCountryName();
	}

}

class Bank {
	public void intrestRateOnLoan() {
		System.out.println("Bank - intrestRateOnLoan");
	}

	public void intrestRateOnSavingAc() {
		System.out.println("Bank - intrestRateOnSavingAc");
	}

	public void getCountryName() {
		System.out.println("Bank - getCountryName");
	}
}

class HDFC extends Bank {

	@Override
	public void intrestRateOnSavingAc() {
		super.intrestRateOnSavingAc();
		System.out.println("HDFC - intrestRateOnSavingAc");
	}
}
