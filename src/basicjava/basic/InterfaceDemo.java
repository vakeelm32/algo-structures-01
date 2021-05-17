package basicjava.basic;

public class InterfaceDemo {

	public static void main(String[] args) {

		Iphone obj = new Iphone();
		obj.BattyBrand();
		obj.BattyType();
		obj.mobileBrand();
		obj.mobileType();
		
		
	}
}

interface Battery {
	void BattyType();
	void BattyBrand();
}

interface Mobile {
	int x = 10; // public static final int x = 10;
	void mobileType();
	void mobileBrand();
}

class Iphone implements Mobile, Battery {

	@Override
	public void mobileType() {
		System.out.println("Iphone Mobile");
	}

	@Override
	public void mobileBrand() {
		System.out.println("Apple Brand");
	}

	@Override
	public void BattyType() {
		System.out.println("Battery type");
	}

	@Override
	public void BattyBrand() {
		System.out.println("Battery Brand");
	}

}
